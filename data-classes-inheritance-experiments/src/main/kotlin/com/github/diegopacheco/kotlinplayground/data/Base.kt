package com.github.diegopacheco.kotlinplayground.data

open class Base(
    /* what is here is part of the constructor */
    open val version: Int = 1,
    open val name: String = "jj",
    open val age: String = "40",
    open val email: String = "m@m.com"
) {
    /* what is here is part of the fields */
    protected val hidden = true
}
