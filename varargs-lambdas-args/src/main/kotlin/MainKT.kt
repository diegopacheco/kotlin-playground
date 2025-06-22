fun runAll(vararg actions: () -> Unit) =
  actions.forEach { it() }

fun main(){
    runAll(
        { println("Action 1 executed") },
        { println("Action 2 executed") },
        { println("Action 3 executed") }
    )
}
