repositories {
  mavenCentral()
  maven("https://jitpack.io")
}

plugins {
  kotlin("jvm") version "1.4.30"
  id("org.beryx.runtime") version "1.12.1"
}

dependencies {
  implementation("com.github.ajalt.clikt:clikt:3.1.0")
  implementation("io.ktor:ktor-server-netty:1.5.1")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.0-M1")
  testImplementation("com.natpryce:hamkrest:1.8.0.1")
  testImplementation("io.mockk:mockk:1.10.6")
}

application {
  mainClass.set("AppKt")
}

tasks {
  test {
    useJUnitPlatform()
  }
  compileKotlin {
    kotlinOptions.jvmTarget = "15"
  }
}