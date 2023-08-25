import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.util.function.Function

class UnitTest {

    @Test
    @Suppress("ObjectLiteralToLambda")
    fun testInnerClass(){
        val benchmark:Benchmark = Benchmark()
        val result = benchmark.now(
            object : Function<String, Int> {
                override fun apply(t: String): Int {
                    return Integer.parseInt(t)
                }
            }, "679").also {
            println(it)
            assertNotNull(it)
        }
    }

    @Test
    fun testLambda(){
        val benchmark:Benchmark = Benchmark()
        val result = benchmark.now(
            { t -> Integer.parseInt(t) }
            ,"679").also {
            println(it)
            assertNotNull(it)
        }
    }

}