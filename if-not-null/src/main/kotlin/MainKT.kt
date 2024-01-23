class UserData(
    var settings: UserData? = null,
    var url:String? = null,
    var twitter:String? = null,
){
    override fun toString() = "$settings $url $twitter"
}

fun main(args: Array<String>) {
    var dataFromDB = UserData()
    var dataFromDB2 = UserData(UserData(UserData(url="www.google.com")))

    println(dataFromDB.settings?.settings?.url)
    println(dataFromDB.settings?.settings?.url ?: "default")
    println(dataFromDB2.settings?.settings?.url)
}