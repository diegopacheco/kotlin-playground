plugins {
    kotlin("multiplatform") version "2.0.21"
}

kotlin {
    jvm()

    js {
        browser()
        nodejs()
    }

    macosX64()
    macosArm64()

    linuxX64()
    linuxArm64()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain {
            dependencies {
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}