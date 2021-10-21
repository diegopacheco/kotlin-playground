package com.github.diegopacheco.kotlinplayground.server

import com.github.diegopacheco.kotlingplayground.helloworld.GreeterGrpcKt
import com.github.diegopacheco.kotlingplayground.helloworld.HelloRequest
import com.github.diegopacheco.kotlingplayground.helloworld.helloReply
import io.grpc.Server
import io.grpc.ServerBuilder

class ServerApp(private val port: Int) {
    val server: Server = ServerBuilder
        .forPort(port)
        .addService(HelloWorldService())
        .build()

    fun start() {
        server.start()
        println("Server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@ServerApp.stop()
                println("*** server shut down")
            }
        )
    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }

    private class HelloWorldService : GreeterGrpcKt.GreeterCoroutineImplBase() {
        override suspend fun sayHello(request: HelloRequest) = helloReply {
            message = "Hello ${request.name}"
        }
    }
}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051
    val server = ServerApp(port)
    server.start()
    server.blockUntilShutdown()
}