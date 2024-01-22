sealed class Menu{
    class Pizza:Menu()
    data object Burguer: Menu()
    data object Fries:Menu()
    data object Coke : Menu()
}

fun main() {
    val order = Menu.Fries
    println(order)

    val order2 = Menu.Pizza()
    println(order2)
}