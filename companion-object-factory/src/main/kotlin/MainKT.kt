class ApiClient private constructor(val url: String) {
  companion object {
    fun fromConfig(): ApiClient = ApiClient("https://api.example.com")
  }
}

fun main(){
    val apiClient = ApiClient.fromConfig()
    println("API Client URL: ${apiClient.url}")
}
