fun main() {
    val frequentSender = messages
        .groupBy(Message::sender)
        .maxByOrNull { (_, messages) -> messages.size }
        ?.key
    println(frequentSender)

    val senders = messages
        .asSequence()
        .filter { it.body.isNotBlank() && !it.isRead }
        .map(Message::sender)
        .distinct()
        .sorted()
        .toList()
    println(senders)
}

data class Message(
    val sender: String,
    val body: String,
    val isRead: Boolean = false,
)

val messages = listOf(
    Message("Ma", "Hey! Where are you?"),
    Message("Adam", "Everything going according to plan today?"),
    Message("Ma", "Please reply. I've lost you!"),
)