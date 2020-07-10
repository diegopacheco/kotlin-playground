package coroutines

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch { // launch a new coroutine in the scope of runBlocking
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)

    runBlocking {
        val job = GlobalScope.launch { // launch a new coroutine and keep a reference to its Job
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        job.join() // wait until child coroutine completes
    }
}