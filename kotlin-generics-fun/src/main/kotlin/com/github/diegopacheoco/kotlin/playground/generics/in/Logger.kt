package com.github.diegopacheoco.kotlin.playground.generics.`in`

// IN allow sub-types for CONSUMER == Parameter
interface Logger<in T> {

    fun log(arg:T):Unit

}