package com.github.diegopacheco.kotlin.fp.lambdafunctions

fun main() {
    val uppercase:(String)->String = { it.toUpperCase() }
    println(uppercase("abcd"))
}