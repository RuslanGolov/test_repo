package com.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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