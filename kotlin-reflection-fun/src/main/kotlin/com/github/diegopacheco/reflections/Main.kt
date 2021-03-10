package com.github.diegopacheco.reflections

import java.lang.reflect.Method
import java.math.BigDecimal

fun main() {
    val stringClass = String::class
    println(stringClass.qualifiedName)
    println("isData: ${stringClass.isData}")
    println("isCompanion: ${stringClass.isCompanion}")
    println("isAbstract: ${stringClass.isAbstract}")
    println("isFinal: ${stringClass.isFinal}")
    println("isSealed: ${stringClass.isSealed}")
    println("BigDecimal members: ${BigDecimal::class.members}")
    println("BigDecimal constructors: ${BigDecimal::class.constructors}")

    val myObject = "Diego Pacheco"
    var method:Method = myObject::class.java.methods.filter {
        m -> if ("toUpperCase" == m.name) true else false
    }.first()
    println("Method is ${method.name}")
    val result = method.invoke(myObject)
    println("Result is: ${result}")

    val kstring = "MY KOTLIN STRING"
    println("Total number of method = ${kstring::class.members.count()}")
    kstring::class.members.forEach{ println(it) }
}