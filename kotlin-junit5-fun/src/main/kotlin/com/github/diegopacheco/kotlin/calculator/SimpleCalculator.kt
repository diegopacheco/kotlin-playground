package com.github.diegopacheco.kotlin.calculator

class SimpleCalculator : Calculator{

    override fun sum(va: Int, vb: Int): Int {
        return va + vb;
    }

    override fun sub(va: Int, vb: Int): Int {
        return va - vb;
    }

    override fun mul(va: Int, vb: Int): Int {
        return va * vb;
    }

    override fun div(va: Int, vb: Int): Int {
        return va / vb;
    }

}