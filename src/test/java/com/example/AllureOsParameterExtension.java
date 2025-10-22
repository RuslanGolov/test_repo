package com.example;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
//import io.qameta.allure.model.LabelName;


public class AllureOsParameterExtension implements BeforeEachCallback {
  @Override
  public void beforeEach(ExtensionContext context) {
    String os = System.getProperty("os.name");
    //var os = "mac";
    //var os = "linux";
    Allure.suite(os);
    Allure.parameter("os", os);
    String originalName = context.getDisplayName();

    Allure.getLifecycle().updateTestCase(result -> {
      String originalId = result.getTestCaseId();
      if (originalId != null) {
        result.setTestCaseId(originalId + "_" + os);
      } else {
        result.setTestCaseId(context.getUniqueId() + "_" + os);
      }

      result.setUuid(result.getUuid() + "_" + os);
      result.setName(result.getName() + " [" + os + "]");

      result.setName(originalName + " [" + os + "]");

      ////Allure.parameter("os", System.getProperty("os.name"));
      ////System.out.println("os ssss:" + System.getProperty("os.name"));
      //Allure.getLifecycle().updateTestCase(result -> {
      //  String baseId = result.getTestCaseId();
      //  result.setTestCaseId(baseId + "_" + os);
      //  result.getLabels().add(new Label().setName(os));
      //  result.setTestCaseName(result.getTestCaseName() + "_" + os);
      //  result.setFullName(result.getFullName() + "_" + os);

      //result.getHistoryId().
    });
  }
}
