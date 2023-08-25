import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce

class SquaresService {

    private val scope = MainScope()

    // infinite stream of integers starting from 1
    @OptIn(ExperimentalCoroutinesApi::class)
    suspend fun produceNumbers() = scope.produce<Int> {
        var x = 1
        while (true) send(x++)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    suspend fun square(numbers: ReceiveChannel<Int>): ReceiveChannel<Int> = scope.produce {
        for (x in numbers) send(x * x)
    }

}