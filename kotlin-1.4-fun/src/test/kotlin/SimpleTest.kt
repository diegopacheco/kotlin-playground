import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SimpleTest {
    @Test
    fun testSumOK():Unit {
        Assertions.assertEquals(2, 1 + 1)
    }
}