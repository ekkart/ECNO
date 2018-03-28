package coded.util;


import workflow.Activity;
import workflow.Case;
import workflow.CaseI;
import workflow.ConstantAtom;
import workflow.DefaultDocument;
import workflow.DefaultDocumentCondition;
import workflow.DocumentDescrAtom;
import workflow.DotOperator;
import workflow.EnumFieldAtom;
import workflow.EnumFieldValue;
import workflow.EnumLiteralAtom;
import workflow.EqualToOperator;
import workflow.Expression;
import workflow.FieldAtom;
import workflow.FieldValue;
import workflow.GreaterThanOperator;
import workflow.LessThanOperator;
import workflow.Operator;
import workflow.UnequalToOperator;
import workflow.WorkflowFactory;

public class DefaultDocumentConditionUtil {
	
	private static DefaultDocumentConditionUtil instance;
	
	GlobalUtil util = GlobalUtil.getInstance();
	
	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static DefaultDocumentConditionUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new DefaultDocumentConditionUtil();
	}


	public boolean evaluate(DefaultDocumentCondition condition, Activity activity) {
		
		
		Case case_ = (Case) activity.eContainer();
		CaseI caseI = util.getCaseI(case_);
		
		return evaluate(condition, caseI);
		
	}
	

	public boolean evaluate(DefaultDocumentCondition condition, CaseI caseI) {
		
		Expression expression = condition.getExpression();
		
		if (!(expression instanceof Operator))
			throw new RuntimeException("error: conditions must contain at least one operator");
		
		Operator operator = (Operator)expression;
		
		Object result = evaluateRecursively(operator, caseI);
		
		if (result instanceof Boolean && result.equals(Boolean.TRUE)) 
			return true;
		else
			return false;

	}

	
	private Object evaluateRecursively(Operator operator, CaseI caseI) {

		Object operand1 = operator.getOperands().get(0);
		Object operand2 = operator.getOperands().get(1);

		// Check if first operand is nested

		if (operand1 instanceof Operator) 
			operand1 = evaluateRecursively((Operator) operand1, caseI);

		// Check second operand is nested

		if (operand2 instanceof Operator) 
			operand2 = evaluateRecursively((Operator) operand2, caseI);

		// Evaluate

		if (operator instanceof DotOperator) {
			
			if (operand1 instanceof DocumentDescrAtom) {
				
				DefaultDocument document = (DefaultDocument) caseI.getCaseDocuments()
						.get(((DocumentDescrAtom) operand1).getDescriptor().getProcessDocument().getName());
				
				if (operand2 instanceof FieldAtom) 
					return (FieldValue) dot(document, (FieldAtom) operand2);
				
				if (operand2 instanceof EnumFieldAtom) 
					return (EnumFieldValue) dot(document, (EnumFieldAtom) operand2);
				
			} else
				throw new RuntimeException("error: first operand must be a document");

		}
			

		if (operator instanceof EqualToOperator) {
			
			if (operand1 instanceof FieldValue && operand2 instanceof ConstantAtom) 
				return (Boolean) equalTo((FieldValue)operand1, (ConstantAtom)operand2);
			
			if (operand1 instanceof EnumFieldValue && operand2 instanceof EnumLiteralAtom) 
				return (Boolean) equalTo((EnumFieldValue)operand1, (EnumLiteralAtom)operand2);
			
			throw new RuntimeException("error: unsupported equal to operand(s)");
			
		}
			
		
		if (operator instanceof UnequalToOperator) {
			
			if (operand1 instanceof FieldValue && operand2 instanceof ConstantAtom) 
				return (Boolean) !equalTo((FieldValue)operand1, (ConstantAtom)operand2);
			
			if (operand1 instanceof EnumFieldValue && operand2 instanceof EnumLiteralAtom) 
				return (Boolean) !equalTo((EnumFieldValue)operand1, (EnumLiteralAtom)operand2);
			
			throw new RuntimeException("error: unsupported unequal to operand(s)");
			
		}
		
		if (operator instanceof LessThanOperator) {
			
			// Not supported for enum types!
			
			if (operand1 instanceof FieldValue && operand2 instanceof ConstantAtom) 
				return (Boolean) lessThan((FieldValue)operand1, (ConstantAtom)operand2);
			
			throw new RuntimeException("error: unsupported less than operand(s)");
			
		}
		
		if (operator instanceof GreaterThanOperator) {
			
			// Not supported for enum types!
			
			if (operand1 instanceof FieldValue && operand2 instanceof ConstantAtom) 
				return (Boolean) greaterThan((FieldValue)operand1, (ConstantAtom)operand2);
			
			throw new RuntimeException("error: unsupported greater than operand(s)");
			
		}
		

		throw new RuntimeException("error: could not evaluate expression");
	}
	
		
	private Boolean greaterThan(FieldValue operand1, ConstantAtom operand2) {
		
		float float1;
		float float2;
		
		try {
			float1 = Float.valueOf(operand1.getValue());
			float2 = Float.valueOf(operand2.getValue());	
		} catch (NumberFormatException e) {
			return false;
		};
			
		return (Boolean) (float1 > float2);
		
	}


	private Boolean lessThan(FieldValue operand1, ConstantAtom operand2) {
		
		float float1;
		float float2;
		
		try {
			float1 = Float.valueOf(operand1.getValue());
			float2 = Float.valueOf(operand2.getValue());	
		} catch (NumberFormatException e) {
			return false;
		};
			
		return (Boolean) (float1 < float2);
	}


	private Boolean equalTo(FieldValue operand1, ConstantAtom operand2) {
		
		// Converts to strings before making the comparison.

		String string1 = (String) operand1.getValue();
		String string2 = (String) operand2.getValue();

		return (Boolean) string1.equals(string2);	
	}
	
	private Boolean equalTo(EnumFieldValue operand1, EnumLiteralAtom operand2) {
		
		return (Boolean) (operand1.getEnumValue() == operand2.getEnumLiteral());	
	}
	
	
	private FieldValue dot(DefaultDocument document, FieldAtom operand2) {
		
		// TODO: currently it's possible to select fields that are not in the,
		// document type, consider filtering in the editor.
 
		for (FieldValue value : document.getFieldValues()) {
			if (value.getField() == operand2.getField()) {
				return value;
			}
		}
		
		throw new RuntimeException("error: dot operation failed");
	}
	
	private EnumFieldValue dot(DefaultDocument document, EnumFieldAtom operand2) {
		
		// TODO: currently it's possible to select fields that are not in the,
		// document type, consider filtering in the editor.

		for (EnumFieldValue value : document.getEnumFieldValues()) {
			if (value.getEnumField() == operand2.getEnumField()) {
				return value;
			}
		}
		
		throw new RuntimeException("error: dot operation failed");
	}

}

