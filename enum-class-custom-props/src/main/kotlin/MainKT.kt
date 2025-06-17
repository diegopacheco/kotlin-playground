enum class HttpCode(val code: Int) {
    OK(200), NOT_FOUND(404), ERROR(500);

    val isSuccess get() = code < 400
}

fun main() {
    val code = HttpCode.OK
    println("Code: ${code.code}, Is Success: ${code.isSuccess}")

    val notFound = HttpCode.NOT_FOUND
    println("Code: ${notFound.code}, Is Success: ${notFound.isSuccess}")

    val error = HttpCode.ERROR
    println("Code: ${error.code}, Is Success: ${error.isSuccess}")
}
