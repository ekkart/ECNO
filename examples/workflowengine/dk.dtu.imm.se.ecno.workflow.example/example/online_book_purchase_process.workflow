<?xml version="1.0" encoding="UTF-8"?>
<workflow:CoreModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://workflow/1.0" name="Online Book Purchase Process">
  <aspects xsi:type="workflow:OrganisationAspect">
    <process xsi:type="workflow:ProcessO" core="//@process">
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.0" name="Place New Order">
        <requiredRoles href="externals_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.1" name="Take Order">
        <requiredRoles href="book_store_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.3" name="Back Order">
        <requiredRoles href="book_store_organisation.workflow#//@roles.2"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.4" followsUpOn="//@aspects.0/@process/@tasks.0" name="Track">
        <requiredRoles href="externals_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.6" followsUpOn="//@aspects.0/@process/@tasks.0" name="Check Receipt">
        <requiredRoles href="externals_organisation.workflow#//@roles.0"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.5" name="Reject">
        <requiredRoles href="book_store_organisation.workflow#//@roles.3"/>
      </tasks>
      <tasks xsi:type="workflow:TaskO" core="//@process/@tasks.2" name="Ship">
        <requiredRoles href="book_store_organisation.workflow#//@roles.1"/>
      </tasks>
      <involved href="book_store_organisation.workflow#//@roles.3"/>
      <involved href="book_store_organisation.workflow#//@roles.2"/>
      <involved href="externals_organisation.workflow#//@roles.0"/>
      <involved href="book_store_organisation.workflow#//@roles.0"/>
      <involved href="book_store_organisation.workflow#//@roles.1"/>
    </process>
  </aspects>
  <aspects xsi:type="workflow:ControlAspect">
    <process xsi:type="workflow:PetriNet" core="//@process" start="//@aspects.1/@process/@places.0" finish="//@aspects.1/@process/@places.5">
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.0" name="Place New Book Order" out="//@aspects.1/@process/@arcs.1" in="//@aspects.1/@process/@arcs.0"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.1" name="Take Order" out="//@aspects.1/@process/@arcs.3 //@aspects.1/@process/@arcs.6" in="//@aspects.1/@process/@arcs.2"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.3" name="Back Order" out="//@aspects.1/@process/@arcs.10" in="//@aspects.1/@process/@arcs.9"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.5" name="Reject" out="//@aspects.1/@process/@arcs.11" in="//@aspects.1/@process/@arcs.7"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.4" name="Track" out="//@aspects.1/@process/@arcs.5" in="//@aspects.1/@process/@arcs.4"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.2" name="Ship" out="//@aspects.1/@process/@arcs.12" in="//@aspects.1/@process/@arcs.8"/>
      <tasks xsi:type="workflow:Transition" core="//@process/@tasks.6" name="Check Receipt" out="//@aspects.1/@process/@arcs.14" in="//@aspects.1/@process/@arcs.13"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.0" name="a1" targetTransition="//@aspects.1/@process/@tasks.0"/>
      <arcs targetPlace="//@aspects.1/@process/@places.1" name="a2" sourceTransition="//@aspects.1/@process/@tasks.0"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.1" name="a3" targetTransition="//@aspects.1/@process/@tasks.1"/>
      <arcs targetPlace="//@aspects.1/@process/@places.2" name="a4" sourceTransition="//@aspects.1/@process/@tasks.1"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.2" name="a5" targetTransition="//@aspects.1/@process/@tasks.4"/>
      <arcs targetPlace="//@aspects.1/@process/@places.2" name="a6" sourceTransition="//@aspects.1/@process/@tasks.4"/>
      <arcs targetPlace="//@aspects.1/@process/@places.3" name="a7" sourceTransition="//@aspects.1/@process/@tasks.1"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.3" name="a8" targetTransition="//@aspects.1/@process/@tasks.3"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.3" name="a9" targetTransition="//@aspects.1/@process/@tasks.5"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.3" name="a10" targetTransition="//@aspects.1/@process/@tasks.2"/>
      <arcs targetPlace="//@aspects.1/@process/@places.3" name="a13" sourceTransition="//@aspects.1/@process/@tasks.2"/>
      <arcs targetPlace="//@aspects.1/@process/@places.4" name="a14" sourceTransition="//@aspects.1/@process/@tasks.3"/>
      <arcs targetPlace="//@aspects.1/@process/@places.4" name="a15" sourceTransition="//@aspects.1/@process/@tasks.5"/>
      <arcs sourcePlace="//@aspects.1/@process/@places.4" name="a16" targetTransition="//@aspects.1/@process/@tasks.6"/>
      <arcs targetPlace="//@aspects.1/@process/@places.5" name="a17" sourceTransition="//@aspects.1/@process/@tasks.6"/>
      <places name="p1 - book" out="//@aspects.1/@process/@arcs.0"/>
      <places name="p2 - book" in="//@aspects.1/@process/@arcs.1" out="//@aspects.1/@process/@arcs.2"/>
      <places name="p3 - book" in="//@aspects.1/@process/@arcs.3 //@aspects.1/@process/@arcs.5" out="//@aspects.1/@process/@arcs.4"/>
      <places name="p4 - book" in="//@aspects.1/@process/@arcs.6 //@aspects.1/@process/@arcs.10" out="//@aspects.1/@process/@arcs.7 //@aspects.1/@process/@arcs.8 //@aspects.1/@process/@arcs.9"/>
      <places name="p6 - book" in="//@aspects.1/@process/@arcs.11 //@aspects.1/@process/@arcs.12" out="//@aspects.1/@process/@arcs.13"/>
      <places name="p7 - book" in="//@aspects.1/@process/@arcs.14"/>
    </process>
  </aspects>
  <aspects xsi:type="workflow:InformationAspect">
    <process xsi:type="workflow:Information" core="//@process">
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.0">
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="book (output, Place Book Order)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </out>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="payment (output, Place Book Order)" processDocument="//@aspects.2/@process/@processDocuments.1">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.2"/>
        </out>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.1">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="book (input, Take Order)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </in>
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="payment (input, Take Order)" processDocument="//@aspects.2/@process/@processDocuments.1">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.2"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="status (output, Take Order)" processDocument="//@aspects.2/@process/@processDocuments.2">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
        </out>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.5">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="status (input, Reject)" processDocument="//@aspects.2/@process/@processDocuments.2">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
        </in>
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="book (input, Reject)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="receipt (output, Reject)" processDocument="//@aspects.2/@process/@processDocuments.3">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.3"/>
        </out>
        <start xsi:type="workflow:DefaultDocumentCondition" name="Payment rejected">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.2/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.1/@enumFields.0"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.1/@enumFields.0/@enumLiterals.1"/>
            </operands>
          </expression>
        </start>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.2">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="status (input, Ship)" processDocument="//@aspects.2/@process/@processDocuments.2">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
        </in>
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="book (input, Ship)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="receipt (output, Ship)" processDocument="//@aspects.2/@process/@processDocuments.3">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.3"/>
        </out>
        <start xsi:type="workflow:DefaultDocumentCondition" name="Payment accepted">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.3/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.1/@enumFields.0"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.1/@enumFields.0/@enumLiterals.0"/>
            </operands>
          </expression>
        </start>
        <start xsi:type="workflow:DefaultDocumentCondition" name="Is in stock">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.3/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.1/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.1/@enumFields.1/@enumLiterals.0"/>
            </operands>
          </expression>
        </start>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.4">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="status (input, Track)" processDocument="//@aspects.2/@process/@processDocuments.2">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
        </in>
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="book (input, Track)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </in>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.6">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="receipt (input, Check Receipt)" processDocument="//@aspects.2/@process/@processDocuments.3">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.3"/>
        </in>
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="book (input, Check Receipt)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </in>
      </tasks>
      <tasks xsi:type="workflow:TaskI" core="//@process/@tasks.3">
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="status (input, Back Order)" processDocument="//@aspects.2/@process/@processDocuments.2">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
        </in>
        <in xsi:type="workflow:DefaultDocumentDescriptor" name="book (input, Back Order)" processDocument="//@aspects.2/@process/@processDocuments.0">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
        </in>
        <out xsi:type="workflow:DefaultDocumentDescriptor" name="status (output, Back Order)" processDocument="//@aspects.2/@process/@processDocuments.2">
          <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
        </out>
        <start xsi:type="workflow:DefaultDocumentCondition" name="Payment accepted">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.6/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.1/@enumFields.0"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.1/@enumFields.0/@enumLiterals.0"/>
            </operands>
          </expression>
        </start>
        <start xsi:type="workflow:DefaultDocumentCondition" name="Not in stock">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.6/@in.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.1/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.1/@enumFields.1/@enumLiterals.1"/>
            </operands>
          </expression>
        </start>
        <finish xsi:type="workflow:DefaultDocumentCondition" name="In stock (finish condition)">
          <expression xsi:type="workflow:EqualToOperator">
            <operands xsi:type="workflow:DotOperator">
              <operands xsi:type="workflow:DocumentDescrAtom" descriptor="//@aspects.2/@process/@tasks.6/@out.0"/>
              <operands xsi:type="workflow:EnumFieldAtom">
                <enumField href="document_types.workflow#//@documentTypes.1/@enumFields.1"/>
              </operands>
            </operands>
            <operands xsi:type="workflow:EnumLiteralAtom">
              <enumLiteral href="document_types.workflow#//@documentTypes.1/@enumFields.1/@enumLiterals.0"/>
            </operands>
          </expression>
        </finish>
      </tasks>
      <processDocuments name="book">
        <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
      </processDocuments>
      <processDocuments name="payment">
        <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.2"/>
      </processDocuments>
      <processDocuments name="status">
        <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.1"/>
      </processDocuments>
      <processDocuments name="receipt">
        <documentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.3"/>
      </processDocuments>
    </process>
  </aspects>
  <process name="Online Book Purchase Process" aspects="//@aspects.1/@process //@aspects.2/@process //@aspects.0/@process">
    <tasks name="Place New Book Order" aspects="//@aspects.1/@process/@tasks.0 //@aspects.2/@process/@tasks.0 //@aspects.0/@process/@tasks.0"/>
    <tasks name="Take Order" aspects="//@aspects.1/@process/@tasks.1 //@aspects.2/@process/@tasks.1 //@aspects.0/@process/@tasks.1"/>
    <tasks name="Ship" aspects="//@aspects.1/@process/@tasks.5 //@aspects.2/@process/@tasks.3 //@aspects.0/@process/@tasks.6"/>
    <tasks name="Back Order" aspects="//@aspects.1/@process/@tasks.2 //@aspects.2/@process/@tasks.6 //@aspects.0/@process/@tasks.2"/>
    <tasks name="Track" aspects="//@aspects.1/@process/@tasks.4 //@aspects.2/@process/@tasks.4 //@aspects.0/@process/@tasks.3"/>
    <tasks name="Reject" aspects="//@aspects.1/@process/@tasks.3 //@aspects.2/@process/@tasks.2 //@aspects.0/@process/@tasks.5"/>
    <tasks name="Check Receipt" aspects="//@aspects.1/@process/@tasks.6 //@aspects.2/@process/@tasks.5 //@aspects.0/@process/@tasks.4"/>
  </process>
  <modelRegistry href="model_registry.workflow#/"/>
</workflow:CoreModel>
