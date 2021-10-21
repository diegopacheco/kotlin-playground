plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation(project(":contract"))
    runtimeOnly("io.grpc:grpc-netty:${rootProject.ext["grpcVersion"]}")
}

tasks.register<JavaExec>("HelloWorldServer") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.github.diegopacheco.kotlinplayground.server.ServerApp")
}

