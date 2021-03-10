package com.github.diegopacheoco.kotlin.playground.generics.`in`

fun main(args:Array<String>) {
    val logger = SimpleLogger<Number>()
    val logger2:Logger<Double> = logger
    logger2.log(42.0)
}
