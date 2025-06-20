enum class Env { DEV, PROD;
  companion object {
    fun from(name: String) = entries.firstOrNull { it.name.equals(name, true) }
  }
}

fun main(){
  val env = Env.from(System.getenv("ENV") ?: "DEV")
  println("Current environment: $env")
  when (env) {
    Env.DEV -> println("Development mode activated.")
    Env.PROD -> println("Production mode activated.")
    null -> println("Unknown environment, defaulting to DEV.")
  }
}
