import kotlinx.coroutines.Dispatchers
import org.junit.jupiter.api.Test
import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import java.time.Duration
import java.time.Instant

@OptIn(ExperimentalCoroutinesApi::class,DelicateCoroutinesApi::class)
class ChannelTest {

    private val mainThreadSurrogate = newSingleThreadContext("MainThread")

    @Test
    fun channelTestSimple() = runTest {
        Dispatchers.setMain(mainThreadSurrogate)
        launch(Dispatchers.Main) {
            val volume = 10_000
            val start:Instant = Instant.now()
            val ss: SquaresService = SquaresService()
            val numbers = ss.produceNumbers()
            val squares = ss.square(numbers)
            repeat(volume) {
                println(squares.receive())
            }
            val end:Instant = Instant.now()
            println("[${volume}] Execution time in : ${Duration.between(start,end).toMillis()} ms")
        }

    }
}