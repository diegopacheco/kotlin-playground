@JvmInline
value class Email(val value: String)
fun Email.isValid(): Boolean = value.contains("@")

fun main(){
    val email = Email("test@gmail.com")
    if (email.isValid()) {
        println("Valid email: ${email.value}")
    } else {
        println("Invalid email: ${email.value}")
    }
}
