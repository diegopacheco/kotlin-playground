
object Storage {
    val users = listOf("user-1234", "user-444")
    val stocks = listOf("GOOG","TESLA","RTKC")
}

object Ecommerce{

    data class CreatePortfolio(
        val userId: String,
        val amount: Double
    )

    data class ChangePortfolio(
        val userId: String,
        val stock: String,
        val quantity: Int
    )

    fun process(event: CreatePortfolio) {
        if (!Storage.users.contains(event.userId)) {
            println("Error users ${event.userId} not found")
            return
        }
        if (event.amount <= 0){
            println("Error amount ${event.amount} is negative")
            return
        }
        println("New Portfolio created for user " +
                "${event.userId} with amount" +
                " ${event.amount}")
    }

    fun process(event: ChangePortfolio){
        if (!Storage.users.contains(event.userId)) {
            println("Error users ${event.userId} not found")
            return
        }
        if (!Storage.stocks.contains(event.stock)){
            println("Error amount ${event.stock} is invalid")
            return
        }
        println("Making Portfolio change for user " +
                "${event.userId} with amount" +
                " ${event.stock}")
    }

}
