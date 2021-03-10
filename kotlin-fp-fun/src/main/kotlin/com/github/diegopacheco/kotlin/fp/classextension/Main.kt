package com.github.diegopacheco.kotlin.fp.classextension

data class Math(val a:Int,val b:Int)

fun Math.sum():Int = a+b
fun Math.sub():Int = a-b
fun Math.mul():Int = a*b
fun Math.div():Int = a/b
fun Math.sqr(n:Int):Int = n*n

fun main() {
    val math = Math(2,3)
    println("2*3=${math.mul()}")
    print("4^2=${math.sqr(4)}")
}