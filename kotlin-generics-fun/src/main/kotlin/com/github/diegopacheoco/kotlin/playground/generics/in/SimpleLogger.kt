package com.github.diegopacheoco.kotlin.playground.generics.`in`;

class SimpleLogger<T> : Logger<T> {

    override fun log(arg:T ){
        println(arg)
    }

}