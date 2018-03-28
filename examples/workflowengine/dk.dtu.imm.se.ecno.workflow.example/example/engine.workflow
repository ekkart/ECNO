<?xml version="1.0" encoding="UTF-8"?>
<workflow:WorkflowEngine xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://workflow/1.0">
  <modelRegistry href="model_registry.workflow#/"/>
  <runtimeCoreModels>
    <aspects xsi:type="workflow:InformationRuntimeAspect"/>
    <coreModel href="error_management_process.workflow#/"/>
  </runtimeCoreModels>
  <runtimeCoreModels>
    <aspects xsi:type="workflow:InformationRuntimeAspect"/>
    <coreModel href="online_book_purchase_process.workflow#/"/>
  </runtimeCoreModels>
  <runtimeGlobalAspects xsi:type="workflow:AgentContainer" href="agents.workflow#/"/>
  <runtimeGlobalAspects xsi:type="workflow:DocumentContainer" href="documents.workflow#/"/>
</workflow:WorkflowEngine>
