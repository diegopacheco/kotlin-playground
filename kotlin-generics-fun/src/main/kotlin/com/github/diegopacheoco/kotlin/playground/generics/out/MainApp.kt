package com.github.diegopacheoco.kotlin.playground.generics.out

fun main(args:Array<String>) {
    val logger = SimpleLogger("String")
    val logger2:Logger<Any> = logger
    println(logger2.log())
}
