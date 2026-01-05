plugins {
    id("java-library")
    id("chirp.spring-boot-service")
}

group = "com.mscoding"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(projects.common)

    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}