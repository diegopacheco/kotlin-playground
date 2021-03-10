package com.github.diegopacheco.kotlin.fp.lambdafunctions

fun main() {
    val uppercase:(String)->String = { it.toUpperCase() }
    println(uppercase("abcd"))

    val lowercase:(String)->String = { str -> str.toLowerCase() }
    println(lowercase("ABCD"))
}