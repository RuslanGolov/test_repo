package com.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlaywrightTest {
  static Playwright playwright;
  static Browser browser;

  @BeforeAll
  static void setup() {
    playwright = Playwright.create();
    browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
  }

  @AfterAll
  static void tearDown() {
    browser.close();
    playwright.close();
  }

  @Test
  void homepageHasPlaywrightInTitle() {
    Page page = browser.newPage();
    page.navigate("https://playwright.dev/");
    assertTrue(page.title().contains("Playwright"));
    assertTrue(page.title().contains("Playwright"));
  }
}
