plugins {
    java

    kotlin("jvm") version "1.8.21"

    `maven-publish`
}

group = "ru.orewaee"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "ru.orewaee"
            artifactId = "krayon"
            version = "1.0.0"

            from(components["java"])
        }
    }
}
