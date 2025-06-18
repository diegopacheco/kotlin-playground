fun safeCall(): Result<String> = runCatching {
  check(Math.random() > 0.5) { "Bad luck" }
  "All good"
}

fun main(){
    val result = safeCall()
    result.onSuccess { println(it) }
            .onFailure { println("Error: ${it.message}") }
}
