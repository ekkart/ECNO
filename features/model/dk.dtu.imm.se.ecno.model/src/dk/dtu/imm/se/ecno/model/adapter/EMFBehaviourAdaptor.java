package dk.dtu.imm.se.ecno.model.adapter;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;

public class EMFBehaviourAdaptor {
	
	final private ExecutionEngine engine;
	
	private Map<EClass,Class<?>> eclass2behaviourclass;
	private Map<EPackage,Class<?>> epackage2behaviourclass;
	
	public EMFBehaviourAdaptor(ExecutionEngine engine) {
		this.engine = engine;
		eclass2behaviourclass = new HashMap<EClass, Class<?>>();
		epackage2behaviourclass = new HashMap<EPackage, Class<?>>();
	}
	
	protected void addElementBehaviour(EClass eclass, Class<?> clazz) {
		eclass2behaviourclass.put(eclass, clazz);
	}


	protected void addPackage(EPackage epackage, Class<?> clazz) {
		epackage2behaviourclass.put(epackage, clazz);
	}
	
	public boolean supportsEClass(EClass eClass) {
		return eclass2behaviourclass.get(eClass) != null ||
				epackage2behaviourclass.get(eClass.getEPackage()) != null;
	}

	public IElementBehaviour createElementBehaviour(Object element, ElementType type) {
		if (element instanceof EObject) {
			Class<?> clazz = eclass2behaviourclass.get(type.getEClass());
			if (clazz == null) {
				clazz = epackage2behaviourclass.get(type.getEClass().getEPackage());
			}
			if (clazz != null) {
				Class<?>[] parameterTypes = new Class<?>[3];
				parameterTypes[0] = ExecutionEngine.class;
				parameterTypes[1] = IElementType.class;
				parameterTypes[2] = EObject.class;

				try {
					Constructor<?> constructor = clazz.getConstructor(parameterTypes);
					if (constructor != null) {
						Object[] objects = new Object[3];
						objects[0] = engine;
						objects[1] = type;
						objects[2] = element;
						return (IElementBehaviour) constructor.newInstance(objects);
					}
				} catch (Throwable e) {};
			}
		}
		return null;
	}
	
}
