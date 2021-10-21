plugins {
    base
    kotlin("jvm") version "1.5.31" apply false
    id("com.google.protobuf") version "0.8.17" apply false
}

allprojects {
    group = "com.github.diegopacheco.kotlinplayground.grpcfun"
    version = "1.0"
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
    ext["grpcVersion"] = "1.39.0"
    ext["grpcKotlinVersion"] = "1.2.0"
    ext["protobufVersion"] = "3.18.1"
    ext["coroutinesVersion"] = "1.5.2"
}

