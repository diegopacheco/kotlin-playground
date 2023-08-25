package com.github.diegopacheco.kotlin.calculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SimpleCalculatorTest {

    var calculator:Calculator? = null

    @BeforeAll
    fun setup() {
        calculator=SimpleCalculator()
    }

    @Test
    fun testSum(){
        val result:Int = calculator?.sum(1,2) ?: -1
        assertEquals(3,result)
    }

    @Test
    fun testSub(){
        val result:Int = calculator?.sub(5,2) ?: -1
        assertEquals(3,result)
    }

    @Test
    fun testMul(){
        val result:Int = calculator?.mul(2,2) ?: -1
        assertEquals(4,result)
    }

    @Test
    fun testDiv(){
        val result:Int = calculator?.div(10,2) ?: -1
        assertEquals(5,result)
    }

}