
fun main(args:Array<String>) {
  val dslSandwich = sandwich {
    with type "toasted"
    bread = "baguette"

    with filling "cheese"
    filling("ham")
    filling("tomato")

    if (this.fillings.count() >= 3) {
      filling("lettuce (free)")
    }

    dressings {
      +"Salt"
      +"Pepper"
    }
    sideOrders {
      side("French Fries")
      side("Chicken Nuggets")
    }
  }.construct()

  println(dslSandwich.receipt())
}


fun sandwich(lunchOrder: SandwichDSL.() -> Unit): SandwichDSL = SandwichDSL().apply(lunchOrder)

class SandwichDSL {
  var type = "simple"
  public var bread: String = "white"
  internal val fillings = Fillings()
  private val dressings = Dressings()
  private val sides = SideOrders()
  public val with = this

  operator fun invoke(lunchOrder: SandwichDSL.() -> Unit): SandwichDSL = SandwichDSL().apply(lunchOrder)

  infix fun type(sandwichType: String): SandwichDSL {
    type = sandwichType
    return this
  }

  infix fun bread(breadType: String): SandwichDSL {
    bread = breadType
    return this
  }

  infix fun filling(fillingToAdd: String): SandwichDSL {
    fillings.apply { +fillingToAdd }
    return this
  }

  infix fun fillings(toAdd: Fillings.() -> Unit): SandwichDSL {
    fillings.toAdd()
    return this
  }

  fun dressings(toAdd: Dressings.() -> Unit): SandwichDSL {
    dressings.toAdd()
    return this
  }

  fun sideOrders(sideOrderToAdd: SideOrders.() -> Unit): SandwichDSL {
    sides.sideOrderToAdd()
    return this
  }

  fun construct(): SandwichDSL {
    println("Making your sandwich")
    return this
  }

  fun receipt(): String {
    var receipt = "$type sandwich on $bread bread"
    receipt += "\n\t" + fillings.receipt()
    receipt += "\n\t" + dressings.receipt()
    receipt += "\n\t" + sides.receipt()
    return "Sandwich Receipt\n$receipt"
  }
}

class SideOrders {
  private val sides = mutableListOf<String>()
  fun side(sideOrderToAdd: String) {
    sides.add(sideOrderToAdd)
  }

  fun receipt(): String {
    return if (sides.isEmpty()) " with no sides "
    else " with sides: " + sides.joinToString(", ")
  }

  fun set(listOfSides: List<String>) {
    sides.clear()
    sides.addAll(listOfSides)
  }
}

class Dressings {
  private val dressings = mutableListOf<String>()

  operator fun String.unaryPlus() = dressings.add(this)

  fun receipt(): String {
    return if (dressings.isEmpty()) " with no dressings "
    else " with dressings: " + dressings.joinToString(", ")
  }

  fun set(listOfDressings: List<String>) {
    dressings.clear()
    dressings.addAll(listOfDressings)
  }
}

class Fillings {
  private val fillings = mutableListOf<String>()

  operator fun String.unaryPlus() = fillings.add(this)

  fun receipt(): String {
    return if (fillings.isEmpty()) " with no fillings "
    else " with fillings: " + fillings.joinToString(", ")
  }

  fun set(listOfFillings: List<String>) {
    fillings.clear()
    fillings.addAll(listOfFillings)
  }

  fun count(): Int {
    return fillings.size
  }

}

