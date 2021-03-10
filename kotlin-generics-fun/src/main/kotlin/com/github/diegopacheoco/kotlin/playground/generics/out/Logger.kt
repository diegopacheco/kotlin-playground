package com.github.diegopacheoco.kotlin.playground.generics.out

// OUT allow supper-types for PRODUCER == Parameter
interface Logger<out T> {

    fun log():T

}