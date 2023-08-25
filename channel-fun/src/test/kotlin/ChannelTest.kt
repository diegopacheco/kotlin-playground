import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.junit.jupiter.api.Test
import kotlinx.coroutines.*
import kotlinx.coroutines.test.setMain

class ChannelTest {

    private val mainThreadSurrogate = newSingleThreadContext("MainThread")

    @Test
    fun channelTestSimple() {
        Dispatchers.setMain(mainThreadSurrogate)
        runBlocking<Unit> {
            launch {
                withContext(Dispatchers.Default) {
                    val ss: SquaresService = SquaresService()
                    val numbers = ss.produceNumbers()
                    val squares = ss.square(numbers)
                    repeat(5) {
                        println(squares.receive())
                    }
                    println("Done!")
                }
            }
        }
    }
    //
}