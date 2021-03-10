package com.github.diegopacheoco.kotlin.playground.generics.out;

class SimpleLogger<T>(val value:T) : Logger<T> {

    override fun log():T{
        return value
    }

}