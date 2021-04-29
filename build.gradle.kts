/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.4.1/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:28.2-jre")
    implementation("com.ibm.icu:icu4j:66.1")
    implementation("com.github.kklisura.cdt:cdt-java-client:2.1.0")
    implementation("info.picocli:picocli:4.2.0")
    // logging
    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation("org.slf4j:jul-to-slf4j:1.7.30")
    runtimeOnly("ch.qos.logback:logback-classic:1.2.3")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

application {
    // Define the main class for the application.
    mainClassName = "io.github.mivalidator.App"
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = application.mainClassName
        attributes["Class-Path"] = configurations.runtimeClasspath.get().map { it.getName() }.joinToString(separator = " ")
    }
}

tasks.register<Sync>("libs") {
    from(configurations.runtimeClasspath)
    into("$buildDir/libs")
}
