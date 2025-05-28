plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
    id("idea")
    id("java")
}

group = "com.mhowell234"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}