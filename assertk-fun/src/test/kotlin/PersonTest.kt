import assertk.assertThat
import assertk.assertions.hasLength
import assertk.assertions.isEqualTo
import assertk.assertions.isGreaterThan
import assertk.assertions.isNotNull
import org.junit.jupiter.api.Test

class PersonTest {

    val person = Person(name = "Bob", age = 21)

    @Test
    fun testName() {
        assertThat(person.name).isEqualTo("Bob")
    }

    @Test
    fun testAge() {
        assertThat(person.age, "age").isGreaterThan(20)
    }

    @Test
    fun testNameProperty() {
        assertThat(person::name).isEqualTo("Bob")
    }

    @Test
    fun nullTest(){
        val nullString: String? = "1234"
        assertThat(nullString).isNotNull().hasLength(4)
    }

}