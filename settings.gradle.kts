pluginManagement {
    repositories {
        maven("/Volumes/sunwarm/project/kmp-test/kotlin-hjc-1030-origin/build/repo")
        maven("https://mirrors.tencent.com/nexus/repository/maven-tencent")
        maven("https://mirrors.tencent.com/nexus/repository/maven-public")
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        maven("/Volumes/sunwarm/project/kmp-test/kotlin-hjc-1030-origin/build/repo")
        maven("https://mirrors.tencent.com/nexus/repository/maven-tencent")
        maven("https://mirrors.tencent.com/nexus/repository/maven-public")
        mavenCentral()
    }
}

rootProject.name = "c2k"

include(":bizA", ":bizB")
