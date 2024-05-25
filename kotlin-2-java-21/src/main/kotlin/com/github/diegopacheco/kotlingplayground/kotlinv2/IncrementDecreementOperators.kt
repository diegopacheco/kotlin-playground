package com.github.diegopacheco.kotlingplayground.kotlinv2

interface Rho {
    operator fun inc(): Sigma
}

interface Sigma : Rho {
    fun sigma() = Unit
}

interface Tau {
    fun tau() = Unit
}

class SimpleSigma : Sigma{
    override fun inc(): Sigma {
        println("SimpleRho inc")
        return SimpleSigma()
    }
}

class SimpleRho : Rho{
    override fun inc(): Sigma {
        println("SimpleRho inc")
        return SimpleSigma()
    }
}

class SimpleTau : Tau{
    override fun tau() {
        println("SimpleTau tau")
    }
}


fun runCode(input: Rho) {
    var unknownObject: Rho = input

    // Check if unknownObject inherits from the Tau interface
    if (unknownObject is Tau) {

        // Uses the overloaded inc() operator from interface Rho,
        // which smart casts the type of unknownObject to Sigma.
        ++unknownObject

        // In Kotlin 2.0.0, the compiler knows unknownObject has type
        // Sigma, so the sigma() function can be called successfully.
        unknownObject.sigma()

        // In Kotlin 1.9.20, the compiler thinks unknownObject has type
        // Tau, so calling the sigma() function is not allowed.

        // In Kotlin 2.0.0, the compiler knows unknownObject has type
        // Sigma, so calling the tau() function is not allowed.
        //unknownObject.tau()
        // Unresolved reference 'tau'

        // In Kotlin 1.9.20, the compiler mistakenly thinks that
        // unknownObject has type Tau, the tau() function can be
        // called successfully.
    }
}