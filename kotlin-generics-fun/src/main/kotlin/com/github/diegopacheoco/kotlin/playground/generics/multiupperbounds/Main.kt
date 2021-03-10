package com.github.diegopacheoco.kotlin.playground.generics.multiupperbounds

fun main() {
    val listOfWords = listOf<String>("my","code","in","kotlin","is","cool","a")
    println(sort(listOfWords))

    // val listOfInts = listOf<Int>(1,2,3,4,5,6)
    // println(sort(listOfInts))
    // Type mismatch. Required: CharSequence Found: Int
}

//
// Where we have multiple upper bounds where we specify more requirements we have about T.
// So we expect a List of T where T is a CharSequence and also implements Comparable.
//
fun <T> sort(xs: List<T>) : List<T> where T : CharSequence, T : Comparable<T> {
    return xs.sorted()
}