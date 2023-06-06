plugins {
    kotlin("jvm") version "1.8.21"

    `maven-publish`
}

group = "ru.orewaee"
version = "1.0.1"

repositories {
    mavenCentral()
}

dependencies {}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "ru.orewaee"
            artifactId = "krayon"
            version = "1.0.1"

            from(components["java"])
        }
    }
}
