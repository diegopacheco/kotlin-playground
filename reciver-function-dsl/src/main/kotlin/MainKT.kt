class Table(val rows:List<Row> = mutableListOf<Row>()){
    fun add(obj:Row){
        rows.addLast(obj)
    }
    override fun toString(): String{
        return rows.toString()
    }
}
class Row(val cells:List<Cell> = mutableListOf<Cell>()) {
    fun add(obj:Cell){
        cells.addLast(obj)
    }
    override fun toString(): String{
        return cells.toString()
    }
}
class Cell(val text:String){
    override fun toString(): String{
        return text
    }
}

fun table(init: Table.() -> Unit): Table {
    val table = Table()
    table.init()
    return table
}

fun Table.row(init: Row.() -> Unit) {
    val row = Row()
    row.init()
    this.add(row)
}

fun Row.cell(text: String) {
    this.add(Cell(text))
}

fun main() {
    val myTable = table {
        row {
            cell("top left")
            cell("top right")
        }
        row {
            cell("bottom left")
            cell("bottom right")
        }
    }
    println(myTable)
}