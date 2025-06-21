import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.delay

suspend fun collectWithTimeout(flow: Flow<Int>, timeMillis: Long) = withTimeout(timeMillis) {
  delay(1000L)
  flow.collect { println(it) }
}

suspend fun main(){
  val res = collectWithTimeout(flow = flowOf(1, 2, 3, 4, 5), timeMillis = 2000L)
  println("Collection completed: $res")

  try{
    val res2 = collectWithTimeout(flow = flowOf(1, 2, 3, 4, 5), timeMillis = 100L)
  }catch (e: Exception) {
    println("Collection failed with exception: ${e.message}")
  }
}
