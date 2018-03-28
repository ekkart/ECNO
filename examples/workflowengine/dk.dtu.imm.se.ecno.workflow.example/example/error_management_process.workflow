<?xml version="1.0" encoding="UTF-8"?>
<workflow:CoreModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://workflow/1.0" name="Error Management Process">
  <aspects xsi:type="workflow:OrganisationAspect">
    <process xsi:type="workflow:ProcessO" core="//@process">
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.0" name="Submit">
        <requiredRoles href="externals_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.1" name="Filter">
        <requiredRoles href="software_company_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.5" followsUpOn="//@aspects.0/@process/@tasks.0" name="Clarify">
        <requiredRoles href="externals_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.2" name="Ignore">
        <requiredRoles href="software_company_organisation.workflow#//@roles.2"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.4" name="Correct DB">
        <requiredRoles href="software_company_organisation.workflow#//@roles.1"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.3" name="Correct GUI">
        <requiredRoles href="software_company_organisation.workflow#//@roles.3"/>
      </tasks>
      <involved href="software_company_organisation.workflow#//@roles.2"/>
      <involved href="externals_organisation.workflow#//@roles.0"/>
      <involved href="software_company_organisation.workflow#//@roles.1"/>
      <involved href="software_company_organisation.workflow#//@roles.3"/>
      <involved href="software_company_organisation.workflow#//@roles.0"/>
    </process>
  </aspects>
  <aspects xsi:type="workflow:ControlAspect">
    <process xsi:type="workflow:PetriNet" core="//@process" start="//@aspects.1/@process/@places.0" finish="//@aspects.1/@process/@places.3">
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.0" out="//@aspects.1/@process/@arcs.1" in="//@aspects.1/@process/@arcs.0"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.1" out="//@aspects.1/@process/@arcs.3" in="//@aspects.1/@process/@arcs.2"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.2" out="//@aspects.1/@process/@arcs.7" in="//@aspects.1/@process/@arcs.4"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.3" out="//@aspects.1/@process/@arcs.8" in="//@aspects.1/@process/@arcs.5"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.4" out="//@aspects.1/@process/@arcs.9" in="//@aspects.1/@process/@arcs.6"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.5" out="//@aspects.1/@process/@arcs.11" in="//@aspects.1/@process/@arcs.10"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.0" name="a1" targetTransition="//@aspects.1/@process/@tasks.0"/>
      <arcs targetPlace="//@aspects.1/@process/@places.1" name="a2" sourceTransition="//@aspects.1/@process/@tasks.0"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.1" name="a3" targetTransition="//@aspects.1/@process/@tasks.1"/>
      <arcs targetPlace="//@aspects.1/@process/@places.2" name="a4" sourceTransition="//@aspects.1/@process/@tasks.1"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.2" name="a5" targetTransition="//@aspects.1/@process/@tasks.2"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.2" name="a6" targetTransition="//@aspects.1/@process/@tasks.3"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.2" name="a7" targetTransition="//@aspects.1/@process/@tasks.4"/>
      <arcs targetPlace="//@aspects.1/@process/@places.3" name="a8" sourceTransition="//@aspects.1/@process/@tasks.2"/>
      <arcs targetPlace="//@aspects.1/@process/@places.3" name="a9" sourceTransition="//@aspects.1/@process/@tasks.3"/>
      <arcs targetPlace="//@aspects.1/@process/@places.3" name="a10" sourceTransition="//@aspects.1/@process/@tasks.4"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.2" name="a11" targetTransition="//@aspects.1/@process/@tasks.5"/>
      <arcs targetPlace="//@aspects.1/@process/@places.1" name="a12" sourceTransition="//@aspects.1/@process/@tasks.5"/>
      <places name="p1" out="//@aspects.1/@process/@arcs.0"/>
      <places name="p2" in="//@aspects.1/@process/@arcs.1 //@aspects.1/@process/@arcs.11" out="//@aspects.1/@process/@arcs.2"/>
      <places name="p3" in="//@aspects.1/@process/@arcs.3" out="//@aspects.1/@process/@arcs.4 //@aspects.1/@process/@arcs.6 //@aspects.1/@process/@arcs.5 //@aspects.1/@process/@arcs.10"/>
      <places name="p4" in="//@aspects.1/@process/@arcs.9 //@aspects.1/@process/@arcs.7 //@aspects.1/@process/@arcs.8"/>
    </process>
  </aspects>
  <aspects xsi:type="workflow:InformationAspect">
    <process xsi:type="workflow:Information" core="//@process">
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.0">
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (output, submit)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </out>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.1">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (input, filter)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (output, filter)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </out>
        <finish xsi:type="workflow:DefaultDocumentCondition" name="Must make a decision to finish">
          <expression xsi:type="workflow:UnequalToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.1/@out.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.4/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.4/@enumFields.1/@enumLiterals.4"/>
            </operands>
          </expression>
        </finish>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.2">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (input, ignore)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </in>
        <start xsi:type="workflow:DefaultDocumentCondition" name="error_report.decision = ignore">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.2/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.4/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.4/@enumFields.1/@enumLiterals.2"/>
            </operands>
          </expression>
        </start>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.3">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (input, gui)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="correction_report (output, gui)" processDocument="//@aspects.2/@process/@processDocuments.1">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.5"/>
        </out>
        <start xsi:type="workflow:DefaultDocumentCondition" name="error_report.decision = gui">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.3/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.4/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.4/@enumFields.1/@enumLiterals.0"/>
            </operands>
          </expression>
        </start>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.4">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (input, db)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="correction_report (output, db)" processDocument="//@aspects.2/@process/@processDocuments.1">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.5"/>
        </out>
        <start xsi:type="workflow:DefaultDocumentCondition" name="error_report.decision = db">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.4/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.4/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.4/@enumFields.1/@enumLiterals.1"/>
            </operands>
          </expression>
        </start>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.5">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (input, clarify)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="error_report (output, clarify)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
        </out>
        <start xsi:type="workflow:DefaultDocumentCondition" name="error_report.decision = clarify">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.5/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.4/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.4/@enumFields.1/@enumLiterals.3"/>
            </operands>
          </expression>
        </start>
      </tasks>
      <processDocuments name="error_report">
        <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.4"/>
      </processDocuments>
      <processDocuments name="correction_report">
        <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.5"/>
      </processDocuments>
    </process>
  </aspects>
  <process name="Error Management Process" aspects="//@aspects.1/@process //@aspects.2/@process //@aspects.0/@process">
    <tasks name="Submit" aspects="//@aspects.1/@process/@tasks.0 //@aspects.2/@process/@tasks.0 //@aspects.0/@process/@tasks.0"/>
    <tasks name="Filter" aspects="//@aspects.1/@process/@tasks.1 //@aspects.2/@process/@tasks.1 //@aspects.0/@process/@tasks.1"/>
    <tasks name="Ignore" aspects="//@aspects.1/@process/@tasks.2 //@aspects.2/@process/@tasks.2 //@aspects.0/@process/@tasks.3"/>
    <tasks name="Correct GUI" aspects="//@aspects.1/@process/@tasks.3 //@aspects.2/@process/@tasks.3 //@aspects.0/@process/@tasks.5"/>
    <tasks name="Correct DB" aspects="//@aspects.1/@process/@tasks.4 //@aspects.2/@process/@tasks.4 //@aspects.0/@process/@tasks.4"/>
    <tasks name="Clarify" aspects="//@aspects.1/@process/@tasks.5 //@aspects.2/@process/@tasks.5 //@aspects.0/@process/@tasks.2"/>
  </process>
  <modelRegistry href="model_registry.workflow#/"/>
</workflow:CoreModel>
