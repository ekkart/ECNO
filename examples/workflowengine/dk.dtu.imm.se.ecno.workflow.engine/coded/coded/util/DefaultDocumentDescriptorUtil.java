package coded.util;

import workflow.Activity;
import workflow.Case;
import workflow.CaseI;
import workflow.DefaultDocument;
import workflow.DefaultDocumentDescriptor;
import workflow.DefaultDocumentType;
import workflow.Document;
import workflow.DocumentContainer;
import workflow.EnumField;
import workflow.EnumFieldValue;
import workflow.Field;
import workflow.FieldValue;
import workflow.InformationRuntimeAspect;
import workflow.RuntimeGlobalAspect;
import workflow.WorkflowEngine;
import workflow.WorkflowFactory;

public class DefaultDocumentDescriptorUtil {
	
	private static DefaultDocumentDescriptorUtil instance;
	
	GlobalUtil util = GlobalUtil.getInstance();
	
	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static DefaultDocumentDescriptorUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new DefaultDocumentDescriptorUtil();
	}

	public DefaultDocument getDocument(DefaultDocumentDescriptor descriptor, CaseI caseI) {
		
		// Called by StartActivity.
		// Note: DefaultDocumentDescripter is very simple and searches only within the name space of the case.
		// TODO: Add support for global document queries.
		
		String key = descriptor.getProcessDocument().getName();
		return (DefaultDocument) caseI.getCaseDocuments().get(key);
		
	}
	
	public DefaultDocument getDocument(DefaultDocumentDescriptor descriptor, Activity activity) {
		
		// Called by FinishActivity.
		// Navigates to caseI. A document only exists in the case when mapped in the document map of CaseI.
		// A dummy document may be attached to activity and we don't want to return this.
		
		Case case_ = (Case) activity.eContainer();
		CaseI caseI = util.getCaseI(case_);
		
		return getDocument(descriptor, caseI);
		
	}

	public Document createDocument(DefaultDocumentDescriptor descriptor, CaseI caseI) {
		
		Case case_= (Case)caseI.eContainer();
		InformationRuntimeAspect ira = util.getInformationRuntimeAspect(case_.getRuntimeCoreModel());
		DocumentContainer database = null;
		
		WorkflowEngine workflowEngine = (WorkflowEngine) caseI.getCore().getRuntimeCoreModel().eContainer();
		for (RuntimeGlobalAspect runtimeGlobalAspect : workflowEngine.getRuntimeGlobalAspects()) {
			if (runtimeGlobalAspect instanceof DocumentContainer) {
				database = (DocumentContainer)runtimeGlobalAspect;		
			}
		}
		
		
		DefaultDocument document = factory.createDefaultDocument();
		document.setName(descriptor.getProcessDocument().getName()); // may not be flexible enough
		document.setId(database.getDocuments().size());
		document.setPlaceholder(false);
		
		DefaultDocumentType type = (DefaultDocumentType) descriptor.getDocumentType();
		document.setDocumentType(type);
		
		for (Field field : type.getFields()) {
			FieldValue fieldValue = factory.createFieldValue();	
			fieldValue.setValue("");
			fieldValue.setField(field);
			document.getFieldValues().add(fieldValue);
		}
		
		for (EnumField enumField : type.getEnumFields()) {
			EnumFieldValue enumFieldValue = factory.createEnumFieldValue();
			enumFieldValue.setEnumValue(enumField.getDefaultValue());
			enumFieldValue.setEnumField(enumField);
			document.getEnumFieldValues().add(enumFieldValue);
		}
		
		String key = descriptor.getProcessDocument().getName();
		database.getDocuments().add(document);
		caseI.getCaseDocuments().put(key, document);
		
		return document;
	}
	
	
	
	
	
}

