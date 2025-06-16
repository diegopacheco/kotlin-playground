
interface Logger {
  fun log(msg: String)
}

object ConsoleLogger : Logger {
  override fun log(msg: String) = println("[LOG] $msg")
}

context(logger: Logger)

fun processJob(job: String) { log("Processing $job") }

fun log(msg: String) {
  print("[LOG] $msg\n")
}

fun contextInjection() {
  with(ConsoleLogger) { processJob("Job#42") }
}

fun main(){
  contextInjection()
}
