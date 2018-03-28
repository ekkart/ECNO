<?xml version="1.0" encoding="UTF-8"?>
<workflow:DocumentContainer xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://workflow/1.0" name="Book Collection of the Online Book Store">
  <engine href="engine.workflow#/"/>
  <documents xsi:type="workflow:DefaultDocument" name="book">
    <DocumentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
    <fieldValues value="The Very Hungry Caterpillar">
      <field href="document_types.workflow#//@documentTypes.0/@fields.0"/>
    </fieldValues>
    <fieldValues value="Eric Carle">
      <field href="document_types.workflow#//@documentTypes.0/@fields.1"/>
    </fieldValues>
    <fieldValues value="1994">
      <field href="document_types.workflow#//@documentTypes.0/@fields.2"/>
    </fieldValues>
  </documents>
  <documents xsi:type="workflow:DefaultDocument" name="book" id="1">
    <DocumentType xsi:type="workflow:DefaultDocumentType" href="document_types.workflow#//@documentTypes.0"/>
    <fieldValues value="Brown Bear, Brown Bear, What Do You See?">
      <field href="document_types.workflow#//@documentTypes.0/@fields.0"/>
    </fieldValues>
    <fieldValues value="Bill Martin Jr">
      <field href="document_types.workflow#//@documentTypes.0/@fields.1"/>
    </fieldValues>
    <fieldValues value="1996">
      <field href="document_types.workflow#//@documentTypes.0/@fields.2"/>
    </fieldValues>
  </documents>
</workflow:DocumentContainer>
