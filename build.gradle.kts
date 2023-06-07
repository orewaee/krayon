plugins {
    kotlin("jvm") version "1.8.21"

    `maven-publish`
}

group = "ru.orewaee"
version = "1.0.2"

repositories {
    mavenCentral()
}

dependencies {}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "ru.orewaee.krayon"
            artifactId = "krayon"
            version = "1.0.2"

            from(components["java"])
        }
    }
}
