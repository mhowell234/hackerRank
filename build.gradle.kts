plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
    id("com.gradle.build-scan") version "3.13.2"
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
    testImplementation("io.github.alexshamrai:junit-ctrf-extension:0.3.3")
    testImplementation(platform("org.junit:junit-bom:5.12.2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}

