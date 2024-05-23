package com.github.diegopacheco.kotlinplayground.data

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun testCopy(){
        val p = Person("NYC","123",
                name = "John",
                age = "30",
                email = "john@john.com"
            )

        val p2 = p.copy(age = "55")
        assertEquals("NYC", p2.address)
        assertEquals("123", p2.taxPayerNumber)
        assertEquals("John", p2.name)
        assertEquals("55", p2.age)
        assertEquals("john@john.com", p2.email)

        p2.show()
    }

}
