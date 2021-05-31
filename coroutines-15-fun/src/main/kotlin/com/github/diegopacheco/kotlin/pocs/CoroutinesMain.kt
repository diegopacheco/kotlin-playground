package com.github.diegopacheco.kotlin.pocs

import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }
    println("Hello")
    buildSequenceFun()
    expensive()
    withTimeout()
    runAsyncComputations()
}

suspend fun buildSequenceFun() {
    val fibonacciSeq = sequence<Int> {
        var a = 0
        var b = 1
        yield(1)
        while (true) {
            yield(a + b)
            val tmp = a + b
            a = b
            b = tmp
        }
    }
    val res = fibonacciSeq
        .take(5)
        .toList()
    println("res $res")
}

suspend fun expensive(){
    runBlocking<Unit> {
        val counter = AtomicInteger(0)
        val numberOfCoroutines = 300_000
        val jobs = List(numberOfCoroutines) {
            launch {
                delay(1000L)
                counter.incrementAndGet()
            }
        }
        jobs.forEach { it.join() }
        assert(counter.get() == numberOfCoroutines)
        print("WOW created $numberOfCoroutines with no OutOfMemoryException!")
    }
}

fun withTimeout(){
    runBlocking<Unit> {
        withTimeout(3000L) {
            repeat(2) { i ->
                println("Some expensive computation $i ...")
                delay(500L)
            }
        }
    }
}


fun runAsyncComputations(){
    runBlocking<Unit> {
        val delay = 3000L
        val time = measureTimeMillis {
            val one = async {
                someExpensiveComputation(delay)
            }
            val two = async{
                someExpensiveComputation(delay)
            }
            runBlocking {
                one.await()
                two.await()
            }
        }
        assert(time < delay * 2)
        println("time $time")
    }
}

suspend fun someExpensiveComputation(delayTime:Long) {
    delay(delayTime)
}
