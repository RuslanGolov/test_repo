package com.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AllureOsParameterExtension.class)
@DisplayNameGeneration(OsDisplayNameGenerator.class)
public class InfoTest {
  @Test
  void test1() {
    Assertions.assertTrue(1 + 1 == 2);
  }

  @Test
  void test2() {
    Assertions.assertTrue(1 - 1 <= 0);
  }

  @Test
  void test3() {
    Assertions.assertTrue(1 * 123 > 0);
  }
}