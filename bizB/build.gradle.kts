plugins {
    kotlin("multiplatform")
}

kotlin {
    ohosArm64("ohosArm64")

    sourceSets {
        val ohosArm64Main by getting {
            dependencies {
                // 使用支持 ohos_arm64 的 atomicfu 版本
                implementation(libs.atomicFu)
            }
        }
    }
}
