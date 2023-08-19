fun main(){
    data class Customer(val name: String, val email: String)

    var c1 = Customer("John","john@customer.com")
    var c2 = Customer("John","john@customer.com")
    var c3 = Customer("Mary","mary@customer.com")

    println(c1.equals(c2))
    println(c3)
    println("c2 name: ${c2.name}  email: ${c2.email}")

}