pluginManagement {
    repositories {
        maven("/Volumes/sunwarm/project/kmp-test/KuiklyBase-kotlin/build/repo")
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        maven("/Volumes/sunwarm/project/kmp-test/KuiklyBase-kotlin/build/repo")
        mavenCentral()
    }
}

rootProject.name = "c2k"
