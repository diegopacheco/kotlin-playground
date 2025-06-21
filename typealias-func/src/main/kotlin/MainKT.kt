typealias AsyncTask<T> = suspend () -> T
val loadData: AsyncTask<String> = { "Data Loaded" }

suspend fun main(){
    val result = loadData()
    println(result)  // Output: Data Loaded
}
