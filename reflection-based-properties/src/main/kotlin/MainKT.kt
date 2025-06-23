class User(val name: String)
val nameProp = User::class.members.first { it.name == "name" }
val nameValue = nameProp.call(User("John Doe"))

fun main(){
    println("User name: $nameValue")
}
