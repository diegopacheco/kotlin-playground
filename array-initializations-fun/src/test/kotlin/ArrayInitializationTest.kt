import org.junit.jupiter.api.Test

class ArrayInitializationTest {

    @Test
    fun testArrayInitializationSimple(){
        val printer:ArrayPrinter = ArrayPrinter()
        val array = arrayOf("January", "February", "March")
        printer.print(array)
    }

    @Test
    fun testArrayInitializationInts(){
        val printer:ArrayPrinter = ArrayPrinter()
        val array:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
        printer.print(array.toTypedArray())
    }

    @Test
    fun testArrayInitializationRange(){
        val printer:ArrayPrinter = ArrayPrinter()
        val array:IntRange = 1..10
        printer.print(array.toList().toIntArray().toTypedArray())
    }

}