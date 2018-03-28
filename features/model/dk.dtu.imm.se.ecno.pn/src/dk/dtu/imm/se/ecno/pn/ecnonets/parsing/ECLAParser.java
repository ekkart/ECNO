package dk.dtu.imm.se.ecno.pn.ecnonets.parsing;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;

import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsFactory;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUses;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement;
import dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter;

public class ECLAParser {
	
	public EventUses parseEventBinding(String text) {
		EventUses result = EcnonetsFactory.eINSTANCE.createEventUses();
		text = text.trim();
		if (text.startsWith("#")) {
			result.setDropParent(true);
			text = text.substring(1);
		} else {
			result.setDropParent(false);
		}
    	ASTParser parser = ASTParser.newParser(AST.JLS3); 
    	parser.setKind(ASTParser.K_STATEMENTS);
    	char[] input =text.toCharArray();
    	parser.setSource(input);
    	ASTNode node = parser.createAST(null);
    	
    	if (node instanceof Assignment) {
    		EventUse eventUse = getEventUse((Assignment) node);
    		if (eventUse != null) {
    			result.getEventuse().add(eventUse);
    		} else {
    			return null;
    		}	
    	} else if (node instanceof Block) {
    		Block block = (Block) node;
    		for (Object object: block.statements()) {
    			if (object instanceof ExpressionStatement) {
    				Expression expression = ((ExpressionStatement) object).getExpression();
    				if (expression instanceof Assignment) {
    					EventUse eventUse = getEventUse((Assignment) expression);
    					if (eventUse != null) {
    						result.getEventuse().add(eventUse);
    					} else {
    						return null;
    					}
    				} else {
    					return null;
    				}
    			} else {
    				return null;
    			}
    		}
    	}
    	
    	if (result.getEventuse().isEmpty()) {
    		return null;
    	}
    	
    	return result;
		
	}
	
	public EventUse getEventUse(Assignment assignment) {
		EventUse result = EcnonetsFactory.eINSTANCE.createEventUse();
		
		Expression expression = assignment.getLeftHandSide();
		String name = this.getFullName(assignment);
		if (name != null) {
			result.setName(name); 
		} else {
			return null;
		}
		
		
		expression = assignment.getRightHandSide();
		if (expression instanceof MethodInvocation) {
			MethodInvocation call = (MethodInvocation) expression;
			result.setType(call.getName().getFullyQualifiedName());
			// List<JavaExpression> list = result.getExpression();
			List<NamedParameter>list = new ArrayList<NamedParameter>();
			boolean namedParametersOnly = true;
			for (Object object: call.arguments()) {
				boolean optional = false;
				if (object instanceof ParenthesizedExpression) {
					// Ekkart Kindler, 26. 5. 2015: Extension to make optional parameter assignments
					// explicit in the model (indicated by an extra pair of parenthesis); note that
					// the code generator exploits that only if all event parameter assignments of
					// an ECNO Net are named!
					object = ((ParenthesizedExpression) object).getExpression();
					optional = true;
				}
				if (object instanceof Assignment) {
					Assignment assignmentParameter = (Assignment) object;
					NamedParameter namedParameter = EcnonetsFactory.eINSTANCE.createNamedParameter();
					namedParameter.setName(getFullName(assignmentParameter));
					namedParameter.setOptional(optional);
					Expression parameterExpression = assignmentParameter.getRightHandSide();
					JavaExpression parameter = EcnonetsFactory.eINSTANCE.createJavaExpression();
					parameter.setCode(parameterExpression.toString());
					namedParameter.setExpression(parameter);
					list.add(namedParameter);
				} else if (object instanceof Expression) {
					NamedParameter namedParameter = EcnonetsFactory.eINSTANCE.createNamedParameter();
					JavaExpression parameter = EcnonetsFactory.eINSTANCE.createJavaExpression();
					Expression argument = (Expression) object;
					parameter.setCode(argument.toString());
					namedParameter.setExpression(parameter);
					list.add(namedParameter);
					namedParametersOnly = false;
				} else {
					return null;
				}
			}
			if (namedParametersOnly) {
				result.getParameter().addAll(list);
			} else {
				// ekki: note that in case there is at least one non-named parameter, all the
				//       parameter names are ignored!
				List<JavaExpression> parameters = result.getExpression();
				for (NamedParameter namedParameter: list) {
					parameters.add(namedParameter.getExpression());
				}
			}
		}
		
		return result;
	}
	
	public String getFullName(Assignment assignment) {
		Expression expression = assignment.getLeftHandSide();
		if (expression instanceof SimpleName) {
			return ((SimpleName)expression).getFullyQualifiedName(); 
		} else if (expression instanceof QualifiedName) {
			return ((QualifiedName)expression).getFullyQualifiedName(); 
		} else {
			return null;
		}
	}
	
	public JavaExpression parseJavaExpression(String text) {
		JavaExpression result = EcnonetsFactory.eINSTANCE.createJavaExpression();
    	ASTParser parser = ASTParser.newParser(AST.JLS3); 
    	parser.setKind(ASTParser.K_EXPRESSION);
    	char[] input =text.toCharArray();
    	parser.setSource(input);
    	ASTNode node = parser.createAST(null);
    	
    	if (node instanceof Expression) {
    		result.setCode(node.toString());
    		return result;
    	} 
    	
    	return null;
	}
	
	public JavaStatement parseJavaStatement(String text) {
		/*
		JavaStatement result = EcnonetsFactory.eINSTANCE.createJavaStatement();
    	ASTParser parser = ASTParser.newParser(AST.JLS3); 
    	parser.setKind(ASTParser.K_STATEMENTS);
    	char[] input =text.toCharArray();
    	parser.setSource(input);
    	ASTNode node = parser.createAST(null);
    	
    	if (!(node instanceof CompilationUnit)) {
    		result.setCode(node.toString());
    		return result;
    	} 
    	return null;
    	*/

		// ekki@dtu.dk, March 6, 2013: take code snippet literally,
		//    without any parsing (example for ATSE 2013)
		JavaStatement result = EcnonetsFactory.eINSTANCE.createJavaStatement();
		result.setCode("{" + System.lineSeparator() + text + System.lineSeparator() + "}");
		return result;
	}
	
	public static ECLAParser getParser() {
		return new ECLAParser();
	}

}
