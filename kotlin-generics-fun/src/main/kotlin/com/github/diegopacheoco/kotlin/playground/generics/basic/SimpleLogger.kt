package com.github.diegopacheoco.kotlin.playground.generics.basic;

class SimpleLogger<T> : Logger<T> {

    override fun log(arg:T ){
        System.out.println(arg)
    }

}