plugins {
    kotlin("multiplatform") version "2.2.0-ohos-04"
}

group = "com.example"
version = "1.0-SNAPSHOT"

// 模拟预处理任务
val preparePrint = tasks.register("preparePrint") {
    doLast {
        println("[preparePrint] Doing some pre-link setup work...")
    }
}
kotlin {
    // 声明目标（使用你给出的 ohosArm64 名称）
    ohosArm64("ohosArm64") {
        binaries {
            sharedLib {
                // baseName -> 输出文件的“基础名”，平台会额外加前缀/后缀（例如 lib<baseName>.so）
                baseName = "c2k"

                // compilation -> 指定使用哪个 compilation（默认 main；可改成 "test" 来观察差异）
                compilation = compilations["main"] // 改成 compilations["test"] 来对比

                // linkerOpts -> 传给系统链接器的参数（用来添加 -L, -l 等）
                // -L<path>：告诉链接器“到哪个目录里找库文件”
                // -l<name>：告诉链接器“要链接名为 lib<name>.so 的库”
                linkerOpts += listOf("-lhilog_ndk.z")

                // freeCompilerArgs -> 来自 Kotlin/Native 编译器的参数（例如 -Xexport-kdoc）
                // compilerArgument：KuiklyBase-kotlin/compiler/arguments/src/org/jetbrains/kotlin/arguments/description/NativeCompilerArguments.kt
                freeCompilerArgs += listOf("-Xreport-perf","-Xdump-perf=${project.buildDir}/dump-report.txt")

                // outputFile -> 在配置/链接阶段可以读取输出文件路径（打印，便于验证）
                println("[config] sharedLib output (will be created at): ${outputFile.absolutePath}")

                linkTaskProvider.configure {
                    dependsOn(preparePrint)
                    doLast {
                        println("[linkTask] finished. final shared file: ${outputFile.get().absolutePath}")
                    }
                }

            }

            // 下面再新建一个命名的 sharedLib，用来对比 compilation = compilations["test"]
            sharedLib("test") {
                baseName = "c2k_test"
                compilation = compilations["test"]
                freeCompilerArgs += "-Xno-optimize" // 只是示例参数，便于分辨
                linkTaskProvider.configure {
                    doLast {
                        println("[linkTask] finished. final shared file: ${outputFile.get().absolutePath}")
                    }
                }
            }
        }
    }

    sourceSets {
        val ohosArm64Main by getting
        val ohosArm64Test by getting
    }
}


// 辅助任务：列出所有 link 开头的 tasks（便于找到精确的 task 名称）
tasks.register("listLinkTasks") {
    doLast {
        println("=== link* tasks in this project (grep/inspect to find the one you need) ===")
        tasks.matching { it.name.startsWith("link") }.forEach { println(" - ${it.path}") }
    }
}

// 在配置后，增加一个任务用来打印 binaries 的 output（更直观）
afterEvaluate {
    tasks.register("printAllBinaryOutputs") {
        doLast {
            println("=== Binary outputs (from kotlin.dsl) ===")
            println("Run './gradlew listLinkTasks' 然后执行对应的 link<Debug/Release>Shared<OhOSArm64> 任务来构建")
        }
    }
}