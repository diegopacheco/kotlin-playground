import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

data class AppState(val counter: Int)

val state = MutableStateFlow(AppState(0))

fun increment() {
    state.value = state.value.copy(counter = state.value.counter + 1)
}

@OptIn(DelicateCoroutinesApi::class)
suspend fun main() {
    val job = state
        .onEach { println("Counter updated: ${it.counter}") }
        .launchIn(CoroutineScope(Dispatchers.Default))

    delay(100)
    println("Initial state: ${state.value.counter}")

    increment()
    increment()

    delay(100)
    job.cancel()
    println("Final state: ${state.value.counter}")
}
