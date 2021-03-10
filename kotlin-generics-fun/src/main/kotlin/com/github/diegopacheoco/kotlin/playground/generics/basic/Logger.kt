package com.github.diegopacheoco.kotlin.playground.generics.basic

interface Logger<T> {

    fun log(arg:T):Unit

}