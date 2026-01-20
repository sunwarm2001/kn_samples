plugins {
    kotlin("multiplatform")
}

kotlin {
    ohosArm64("ohosArm64") {
        compilations.all {
            compilerOptions.configure {
                // 根据 BUG_ANALYSIS.md，这些参数是触发 bug 的关键
                freeCompilerArgs.add("-Xbinary=emitRuntime=noruntime")
                freeCompilerArgs.add("-Xbinary=moduleExclude=stdlib")
            }
        }
        binaries.sharedLib {
            baseName = "bizB"
        }
    }

    sourceSets {
        val ohosArm64Main by getting {
            dependencies {
                // 使用支持 ohos_arm64 的 atomicfu 版本
                implementation(libs.atomicFu)
            }
        }
    }
}
