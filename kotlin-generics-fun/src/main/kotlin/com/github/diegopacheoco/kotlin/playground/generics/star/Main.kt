package com.github.diegopacheoco.kotlin.playground.generics.star

fun main() {
    val numbers = arrayOf(1,2,3,4,5,6)
    printArray(numbers)

    val strings = arrayOf("A","B","C")
    printArray(strings)
}

// when we dont care about type we use star projections(*)
fun printArray(array:Array<*>){
    array.forEach {
        print(it)
    }
    println("")
}