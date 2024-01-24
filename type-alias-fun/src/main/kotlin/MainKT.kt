data class Item(val name: String, val price: Double)
typealias Cart = MutableMap<Item, Int>

fun main() {
    val cart: Cart = mutableMapOf(
        Item("apple", 0.99) to 2,
        Item("banana", 0.79) to 3,
        Item("orange", 0.69) to 1
    )

    println(cart)
    val newItem = Item("pear", 1.29)
    cart[newItem] = 4

    println(cart)
}
