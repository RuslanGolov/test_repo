package com.example;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
//import io.qameta.allure.model.LabelName;


public class AllureOsParameterExtension implements BeforeEachCallback {
  @Override
  public void beforeEach(ExtensionContext context) {
    String os = System.getProperty("os.name");
    //String os = "linux";


    Allure.getLifecycle().updateTestCase(result -> {
      String baseId = result.getTestCaseId();
      if (baseId == null) {
        baseId = context.getUniqueId();
      }
      result.setTestCaseId(baseId + "_" + os);
      result.setHistoryId(result.getHistoryId() + "_" + os);

      result.setUuid(result.getUuid() + "_" + os);

      result.setName(result.getName() + " [" + os + "]");
    });
  }
}