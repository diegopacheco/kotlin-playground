package com.github.diegopacheco.kotlingplayground.kotlinv2

interface Status {
    fun signal() {}
}

interface Ok : Status
interface Postponed : Status
interface Declined : Status

class SuperPostponed : Postponed{
    override fun signal() {
        println("SuperPostponed signal")
    }
}

fun signalCheck(signalStatus: Any) {
    if (signalStatus is Postponed || signalStatus is Declined) {
        // signalStatus is smart-cast to a common supertype Status
        signalStatus.signal()
        // Prior to Kotlin 2.0.0, signalStatus is smart cast
        // to type Any, so calling the signal() function triggered an
        // Unresolved reference error. The signal() function can only
        // be called successfully after another type check:
        // check(signalStatus is Status)
        // signalStatus.signal()
    }
}