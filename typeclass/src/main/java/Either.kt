sealed class Either<out L, out R> {
    data class Left<out L>(val value: L) : Either<L, Nothing>()
    data class Right<out R>(val value: R) : Either<Nothing, R>()

    fun isLeft(): Boolean = this is Left<L>
    fun isRight(): Boolean = this is Right<R>

    fun <L> leftOrNull(): Any? = (this as? Left<L>)?.value
    fun <R> rightOrNull(): Any? = (this as? Right<R>)?.value

    fun <T> fold(onLeft: (L) -> T, onRight: (R) -> T): T =
        when (this) {
            is Left -> onLeft(value)
            is Right -> onRight(value)
        }
}
