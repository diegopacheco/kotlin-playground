package com.github.diegopacheco.kotlinplayground.data

data class Person(
    /* here is a constructor */
    val address: String,
    val taxPayerNumber: String,
    override val name: String,
    override val age: String,
    override val email: String,
) : Base(
    /* could override values from parent class */
    /*  name = "", age = "", email = "" */
){

    private val country: String = ""

    fun show(){
       println(" Base.name ${name} " +
               " Base.age ${age} " +
               " Base.email ${email} " +
               " Base.version ${version} " +
               " Base.hidden ${hidden} " +
               " Person.address ${address} " +
               " Person.taxPayerNumber ${taxPayerNumber} " +
               " Person.country ${country} ");
    }

}