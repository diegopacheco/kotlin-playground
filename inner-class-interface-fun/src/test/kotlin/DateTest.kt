import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateTest {

    @Test
    fun testInnerClass() {
        val provider: DateProvider = object : DateProvider {
            override fun getToday(): String {
                val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                val today: String = LocalDateTime.now().format(formatter)
                return today
            }
        }
        val today = provider.getToday()
        println(today)
        assertNotNull(today)
    }

}