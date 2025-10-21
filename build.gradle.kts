plugins {
  java
  id("io.qameta.allure") version "3.0.0"
}

repositories {
  mavenCentral()
}

dependencies {
  // Playwright Java
  testImplementation("io.qameta.allure:allure-junit5:2.30.0")

//  testImplementation("com.microsoft.playwright:playwright:1.46.0")

  // JUnit 5 for tests
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

sourceSets {
  test {
    resources {
      srcDir("src/main/resources")
      srcDir("src/test/java")
      include(
        "**/*.properties",
        "**/*.json",
      )
    }
  }
}

allure {
  version.set("2.35.1") // Allure CLI
  adapter {
    frameworks {
      junit5 {
        adapterVersion.set("2.30.0")
      }
    }
    aspectjWeaver.set(true)
  }
}

tasks.test {
  useJUnitPlatform()
}
