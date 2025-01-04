// build.gradle.kts (na raiz)
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4") // Ajuste conforme a versão que você usa
        classpath(kotlin("gradle-plugin", version = "1.5.21")) // Kotlin (caso use Kotlin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
