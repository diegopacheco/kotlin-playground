import assertk.all
import assertk.assertFailure
import assertk.assertThat
import assertk.assertions.*
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

    @Test
    fun multipleAssertions() {
        val string = "Test"
        assertThat(string).all {
            isNotNull()
            isNotEmpty()
            startsWith("T")
            hasLength(4)
        }
    }

    @Test
    fun extractDataTest(){
        val person = Person(name="John Doe",age = 22)
        assertThat(person).prop(Person::age).isEqualTo(22)
    }

    @Test
    fun testCollections(){
        assertThat(listOf(1, 2, 3)).index(1).isEqualTo(2)
        assertThat(mapOf("one" to 1, "two" to 2, "three" to 3)).key("two").isEqualTo(2)
    }

    @Test
    fun testExceptions(){
        assertFailure {
            throw Exception("very wrong")
        }.hasMessage("wrong")
    }

}