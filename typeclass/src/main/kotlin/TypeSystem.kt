import arrow.core.Either
import arrow.core.EitherNel
import arrow.core.NonEmptyList
import arrow.core.raise.either
import arrow.core.raise.Raise
import arrow.core.nel

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
                else println(
                    "New Portfolio created for user " +
                            "${event.userId} with amount" +
                            " ${event.amount}"
                )
            }

            is Validatable.ChangePortfolio -> {
                if (!Storage.users.contains(event.userId)) Unit
                else if (!Storage.stocks.contains(event.stock)) Unit
                else println(
                    "Making Portfolio change for user " +
                            "${event.userId} with amount" +
                            " ${event.stock}"
                )
            }
        }
    }
}

object EcommerceV3 {
    data class ValidationError(val message: String)
    interface Validatable<T> {
        fun check(): EitherNel<ValidationError, T>
    }

    data class CreatePortfolio(
        val userid: String,
        val amount: Double
    ) : Validatable<CreatePortfolio> {
        override fun check(): EitherNel<ValidationError, CreatePortfolio> =
            EitherNel.zipOrAccumulate(
                if (!Storage.users.contains(userid)) Either.Left(ValidationError( "Error users $userid not found"))
                else Either.Right(this),
                if (amount <= 0.0) Either.Left(ValidationError("Error amount $amount is negative"))
                else Either.Right(this)
            ) { a, _ -> a }
    }
}

object EcommerceV4{
    data class ValidationError(val message: String)
    data class CreatePortfolio(
        val userId: String,
        val amount: Double
    )
    data class ChangePortfolio(
        val userId: String,
        val stock: String,
        val quantity: Int
    )
    interface Validator<T>{
        fun check(item: T): EitherNel<ValidationError,T>
    }

    val createPortfolioValidator = object : Validator<CreatePortfolio> {
        override fun check(item: CreatePortfolio): EitherNel<ValidationError, CreatePortfolio> =
            EitherNel.zipOrAccumulate(
                if (!Storage.users.contains(item.userId)) Either.Left(ValidationError("Error users ${item.userId} not found"))
                else Either.Right(item),
                if (item.amount <= 0.0) Either.Left(ValidationError("Error amount ${item.amount} is negative"))
                else Either.Right(item)
            ) { a, _ -> a }
    }

    fun <T> process(event: T, validator: Validator<T>) = either {
        val validated: T = validator.check(event).bind()

        println("Event $event processed successfully")
    }.onLeft { errors -> println("Found Validation errors ${errors.map { it.message }}") }
}

object EcommerceV5 {
    data class ValidationError(val message: String)

    data class CreatePortfolio(
        val userId: String,
        val amount: Double
    )

    interface ValidatorScope<T> {
        fun T.check(): Either<NonEmptyList<ValidationError>, T>
    }

    val createPortfolioValidator = object : ValidatorScope<CreatePortfolio> {
        override fun CreatePortfolio.check(): Either<NonEmptyList<ValidationError>, CreatePortfolio> =
            if (!Storage.users.contains(userId))
                Either.Left(ValidationError("Error users $userId not found").nel())
            else if (amount <= 0.0)
                Either.Left(ValidationError("Error amount $amount is negative").nel())
            else
                Either.Right(this)
    }

    context(scope: ValidatorScope<T>)
    fun <T> process(event: T): Either<NonEmptyList<ValidationError>, Unit> =
        event.check().map { validated ->
            println("Event $validated processed successfully")
        }.onLeft { errors ->
            println("Found Validation errors ${errors.map { error -> error.message }}")
        }

    fun main(args: Array<String>) {
        with(createPortfolioValidator) {
            process(CreatePortfolio("user-1234", -10.0))
            process(CreatePortfolio("user-1111", 10.0))
        }
    }
}
