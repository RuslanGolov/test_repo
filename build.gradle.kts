plugins {
  java
}

repositories {
  mavenCentral()
}

dependencies {
  // Playwright Java
  testImplementation("com.microsoft.playwright:playwright:1.46.0")

  // JUnit 5 for tests
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

tasks.test {
  useJUnitPlatform()
}
