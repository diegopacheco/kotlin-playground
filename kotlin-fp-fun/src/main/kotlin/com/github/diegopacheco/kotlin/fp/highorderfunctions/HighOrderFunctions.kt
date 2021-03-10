package com.github.diegopacheco.kotlin.fp.highorderfunctions

// Kotlin allow us to import functions(fun)
import com.github.diegopacheco.kotlin.fp.highorderfunctions.Math.calc

fun main() {
    val result = calc(2,2, Math::sum)
    println("2+2==${result}")
}