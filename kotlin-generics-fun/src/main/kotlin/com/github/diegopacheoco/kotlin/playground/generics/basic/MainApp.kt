package com.github.diegopacheoco.kotlin.playground.generics.basic

fun main(args:Array<String>) {
    val logger:Logger<String> = SimpleLogger()
    logger.log("This is a test")
}
