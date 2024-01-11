plugins {
    id("java")
}

group = "de.mueller.franz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.rometools:rome:2.1.0")
    implementation ("com.google.code.gson:gson:2.10.1")


}

tasks.test {
    useJUnitPlatform()
}