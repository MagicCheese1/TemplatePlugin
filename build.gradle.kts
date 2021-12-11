plugins {
    id("com.github.johnrengelman.shadow") version "7.1.0"
    java
}

group = "template.templategroup"

repositories {
    mavenCentral()
    mavenLocal()
    maven(url = "https://oss.sonatype.org/content/groups/public/")
}

dependencies {
    implementation("org.jetbrains:annotations:16.0.2")
    compileOnly("org.spigotmc:spigot:1.17.1-R0.1-SNAPSHOT")
}

