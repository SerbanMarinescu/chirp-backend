import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    id("chirp.kotlin-common")
    kotlin("plugin.jpa")
    kotlin("plugin.spring")
    id("io.spring.dependency-management")
}

configure<DependencyManagementExtension> {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:${libraries.findVersion("spring-boot").get()}")
    }
}

dependencies {
    "implementation"(libraries.findLibrary("kotlin-reflect").get())
    "implementation"(libraries.findLibrary("kotlin-stdlib").get())
    "implementation"(libraries.findLibrary("spring-boot-starter-web").get())

    "testImplementation"(libraries.findLibrary("spring-boot-starter-test").get())
    "testImplementation"(libraries.findLibrary("kotlin-test-junit5").get())

    "testRuntimeOnly"(libraries.findLibrary("junit-platform-launcher").get())
}