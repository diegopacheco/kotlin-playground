fun main(args: Array<String>) {
    optionOne()
    optionTwo()
}

fun optionOne(){
    val name: String? = null
    val displayName = name ?: "Guest"
    println(displayName)
}

class User(val name:String = "John Doe")
fun optionTwo(){
    val user: User? = null
    val message = user?.let { "Welcome back, ${it.name}" } ?: "Welcome guest"
    println(message)
}