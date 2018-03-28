/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.util;

import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcnonetsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnonetsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EcnonetsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EcnonetsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EcnonetsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EcnonetsResourceFactoryImpl());
		}
		return registrations;
	}

} //EcnonetsXMLProcessor
