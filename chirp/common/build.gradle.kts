plugins {
    id("java-library")
    id("chirp.kotlin-common")
}

group = "com.mscoding"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    api(libs.kotlin.reflect)
    api(libs.jackson.module.kotlin)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}