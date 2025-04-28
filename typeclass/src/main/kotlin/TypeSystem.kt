object Storage {
    val users = listOf("user-1234", "user-444")
    val stocks = listOf("GOOG", "TESLA", "RTKC")
}

object Ecommerce {

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
        if (event.amount <= 0) {
            println("Error amount ${event.amount} is negative")
            return
        }
        println(
            "New Portfolio created for user " +
                    "${event.userId} with amount" +
                    " ${event.amount}"
        )
    }

    fun process(event: ChangePortfolio) {
        if (!Storage.users.contains(event.userId)) {
            println("Error users ${event.userId} not found")
            return
        }
        if (!Storage.stocks.contains(event.stock)) {
            println("Error amount ${event.stock} is invalid")
            return
        }
        println(
            "Making Portfolio change for user " +
                    "${event.userId} with amount" +
                    " ${event.stock}"
        )
    }

}

object EcommerceV2 {
    sealed interface Validatable {
        data class CreatePortfolio(
            val userId: String,
            val amount: Double
        ) : Validatable

        data class ChangePortfolio(
            val userId: String,
            val stock: String,
            val quantity: Int
        ) : Validatable
    }

    fun process(event: Validatable) {
        when (event) {
            is Validatable.CreatePortfolio -> {
                if (!Storage.users.contains(event.userId)) Unit
                else if (event.amount <= 0) Unit
                else println("New Portfolio created for user " +
                            "${event.userId} with amount" +
                            " ${event.amount}")
            }
            is Validatable.ChangePortfolio -> {
                if (!Storage.users.contains(event.userId)) Unit
                else if (!Storage.stocks.contains(event.stock)) Unit
                else println("Making Portfolio change for user " +
                            "${event.userId} with amount" +
                            " ${event.stock}")
            }
        }
    }
}

object EcommerceV3{
    data class ValidationError(val message:String)
    interface Validatable<T>{
        fun check(): Either<ValidationError,T>
    }

    data class CreatePortfolio(
        val userid:String,
        val amount: Double
    ): Validatable<CreatePortfolio>{
        override fun check(): Either<ValidationError, CreatePortfolio> {
            TODO("Not yet implemented")
        }
    }
}