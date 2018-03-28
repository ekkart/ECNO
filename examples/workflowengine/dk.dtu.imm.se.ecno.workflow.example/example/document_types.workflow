<?xml version="1.0" encoding="UTF-8"?>
<workflow:DocumentTypeContainer xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://workflow/1.0" name="Document Types #1">
  <modelRegistry href="model_registry.workflow#/"/>
  <documentTypes xsi:type="workflow:DefaultDocumentType" name="BookDoc">
    <fields name="Title"/>
    <fields name="Author"/>
    <fields name="Year"/>
  </documentTypes>
  <documentTypes xsi:type="workflow:DefaultDocumentType" name="StatusDoc">
    <fields name="Comment"/>
    <enumFields name="Payment" defaultValue="//@documentTypes.1/@enumFields.0/@enumLiterals.2">
      <enumLiterals name="Accepted"/>
      <enumLiterals name="Rejected"/>
      <enumLiterals name="{no value for &quot;Payment&quot;}"/>
    </enumFields>
    <enumFields name="Availability" defaultValue="//@documentTypes.1/@enumFields.1/@enumLiterals.2">
      <enumLiterals name="In Stock"/>
      <enumLiterals name="Not In Stock"/>
      <enumLiterals name="{no value for &quot;Availability&quot;}"/>
    </enumFields>
  </documentTypes>
  <documentTypes xsi:type="workflow:DefaultDocumentType" name="PaymentDoc">
    <fields name="Card Number"/>
    <fields name="Full Name"/>
    <fields name="Expire Date"/>
    <fields name="Security Code"/>
  </documentTypes>
  <documentTypes xsi:type="workflow:DefaultDocumentType" name="ReceiptDoc">
    <fields name="Tracking Number"/>
    <fields name="Comment"/>
    <enumFields name="Order Status" defaultValue="//@documentTypes.3/@enumFields.0/@enumLiterals.2">
      <enumLiterals name="Completed"/>
      <enumLiterals name="Cancelled"/>
      <enumLiterals name="{no value for &quot;Status&quot;}"/>
    </enumFields>
    <enumFields name="Courier" defaultValue="//@documentTypes.3/@enumFields.1/@enumLiterals.4">
      <enumLiterals name="DHL"/>
      <enumLiterals name="Royal Mail"/>
      <enumLiterals name="FedEx"/>
      <enumLiterals name="n/a"/>
      <enumLiterals name="{no value for &quot;Courier&quot;}"/>
    </enumFields>
  </documentTypes>
  <documentTypes xsi:type="workflow:DefaultDocumentType" name="Error Report Doc">
    <fields name="Reproduction Steps (Customer)"/>
    <fields name="Error Description (Customer)"/>
    <fields name="Review Comment (Manager)"/>
    <enumFields name="Severity" defaultValue="//@documentTypes.4/@enumFields.0/@enumLiterals.3">
      <enumLiterals name="Low"/>
      <enumLiterals name="Mid"/>
      <enumLiterals name="High"/>
      <enumLiterals name="{no value for &quot;Severity&quot;}"/>
    </enumFields>
    <enumFields name="Decision" defaultValue="//@documentTypes.4/@enumFields.1/@enumLiterals.4">
      <enumLiterals name="GUI Problem"/>
      <enumLiterals name="DB Problem"/>
      <enumLiterals name="Ignore"/>
      <enumLiterals name="Clarification Needed"/>
      <enumLiterals name="{no value for &quot;Decision&quot;}"/>
    </enumFields>
  </documentTypes>
  <documentTypes xsi:type="workflow:DefaultDocumentType" name="Correction Report Doc">
    <fields name="Corrected By"/>
    <fields name="Problem Description"/>
    <fields name="Solution Description"/>
    <fields name="Hours Spent"/>
    <fields name="Target Release"/>
    <fields name="Original Error Report (TODO: could be doc reference)"/>
  </documentTypes>
</workflow:DocumentTypeContainer>
