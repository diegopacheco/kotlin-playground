sealed interface UiEvent
object Click : UiEvent
object Swipe : UiEvent
fun handleEvent(e: UiEvent): String = when (e) {
  Click -> "Clicked"
  Swipe -> "Swiped"
}

fun main(){
  val event: UiEvent = Click
  println(handleEvent(event)) // Output: Clicked
}
