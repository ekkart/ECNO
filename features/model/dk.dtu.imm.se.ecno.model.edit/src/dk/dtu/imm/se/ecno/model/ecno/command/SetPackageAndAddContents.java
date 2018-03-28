package dk.dtu.imm.se.ecno.model.ecno.command;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import dk.dtu.imm.se.ecno.model.ecno.EcnoFactory;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.Reference;

/**
 * Command that sets the reference of an ECNO package to an Ecore package, and,
 * if the ECNO package is empty yet; creates ECNO elements, references and
 * inheritance for each class and reference of the Ecore package.
 * 
 * @author eki
 * @generated NOT
 * 
 */
public class SetPackageAndAddContents extends CompoundCommand {
   
	protected EditingDomain domain;
	protected Package ecnoPackage;
	protected EPackage ecorePackage;
	
	public SetPackageAndAddContents(EditingDomain domain,
			Package ecnoPackage,
			EPackage ecorePackage,
			Command command) {
		this.domain = domain;
		this.ecnoPackage = ecnoPackage;
		this.ecorePackage = ecorePackage;
		
		append(command);
	}
	
	public void execute() {

		// add the reference to the Ecore package (default command)
		super.execute();
		
		// now add the rest if the ECNO package is still empty
		if (ecnoPackage.getElementTypes().size() == 0) {
			EcnoFactory factory = EcnoFactory.eINSTANCE;
			EcnoPackage pack = EcnoPackage.eINSTANCE;
			Map<EClass,ElementType> class2elementType = new HashMap<EClass,ElementType>();
			for (EClassifier classifier: ecorePackage.getEClassifiers()) {
				if (classifier instanceof EClass) {
					// for each new Ecore class
					EClass eClass = (EClass) classifier;
					if (class2elementType.containsKey(eClass)) {
						continue;
					}
					// create and add a corresponding ECNO ElementType
					ElementType elementType = factory.createElementType();
					elementType.setEClass(eClass);
					class2elementType.put(eClass, elementType);	
					appendAndExecute(new AddCommand(domain, ecnoPackage,
							pack.getPackage_ElementTypes(), elementType));
				}	
			}
			
			for (EClassifier classifier: ecorePackage.getEClassifiers()) {
				ElementType elementType = class2elementType.get(classifier);
				if (elementType != null) {
					// for each class
					EClass eClass =  elementType.getEClass();
					for (EReference eReference: eClass.getEReferences()) {
						// for each Ecore reference of a class
						EClass targetClass = eReference.getEReferenceType();
						ElementType targetElementType = class2elementType.get(targetClass);
						if (targetElementType != null) {
							// for which the target class is in the same package
                            // create and add a ECNO Reference for the respective ElementType
							Reference reference = factory.createReference();
							reference.setEReference(eReference);
							reference.setTarget(targetElementType);
							appendAndExecute(new AddCommand(domain, elementType,
									pack.getElementType_References(), reference));
						}	
					}
					
					for (EClass superClass: eClass.getESuperTypes()) {
						// add one super ElementType to the respective ElementType
						ElementType superElementType = class2elementType.get(superClass);
						if (superElementType != null) {
							appendAndExecute(new SetCommand(domain, elementType,
									pack.getElementType_Super(), superElementType));
							// note that ECNO Elements do not support multiple inheritance
							// here, the first one that is within the same package is picked
							// as the super Element type
							break;
						}
					}
				}
			}	
		}
	}

}

