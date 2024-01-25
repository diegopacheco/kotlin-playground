package com.github.diegopacheco.uuid

import java.util.*

expect fun randomUUID(): String
actual fun randomUUID() = UUID.randomUUID().toString()

fun main(){
  println("hello World Kotlin " + randomUUID())
}
