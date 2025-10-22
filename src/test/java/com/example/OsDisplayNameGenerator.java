package com.example;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class OsDisplayNameGenerator extends DisplayNameGenerator.Standard {
  //String os = "linux";
  //String os = "mac";
  String os = System.getProperty("os.name");

  @Override
  public String generateDisplayNameForClass(Class<?> testClass) {
    return super.generateDisplayNameForClass(testClass) + " [" + os + "]";
  }

  @Override
  public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
    return super.generateDisplayNameForNestedClass(nestedClass) + " [" + os + "]";
  }

  @Override
  public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
    return super.generateDisplayNameForMethod(testClass, testMethod) + " [" + os + "]";
  }
}
