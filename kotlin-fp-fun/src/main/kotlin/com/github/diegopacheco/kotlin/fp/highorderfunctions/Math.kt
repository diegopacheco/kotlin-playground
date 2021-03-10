package com.github.diegopacheco.kotlin.fp.highorderfunctions

object Math {
    fun sum(x: Int, y: Int) = x + y
    fun sub(x: Int, y: Int) = x - y
    fun mul(x: Int, y: Int) = x * y
    fun division(x: Int, y: Int) = x / y
    fun calc(x:Int, y:Int, op:(Int,Int)->Int):Int {
        return op(x, y)
    }
}