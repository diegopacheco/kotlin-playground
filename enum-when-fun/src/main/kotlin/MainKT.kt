enum class Status { LOADING, SUCCESS, ERROR }

fun describeStatus(s: Status) = when (s) {
  Status.LOADING -> "Loading..."
  Status.SUCCESS -> "Done"
  Status.ERROR -> "Failed"
}

fun main(){
  val status = Status.LOADING
  println(describeStatus(status)) // Output: Loading...
}
