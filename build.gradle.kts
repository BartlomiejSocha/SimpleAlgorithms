import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "me.tarble"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
    implementation("org.mockito:mockito-junit-jupiter:3.12.4")
    implementation("org.mockito:mockito-testng:0.4.13")
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:3.12.4")

}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}