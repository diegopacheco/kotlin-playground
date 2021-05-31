package com.github.diegopacheco.kotlin.pocs

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }
    println("Hello")
}