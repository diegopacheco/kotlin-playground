fun main(args:Array<String>) {
    val mails = listOf(
        "pig@animal.com",
        "dog@animal.com",
        "cat@animal.com",
        "parrot@animal.com",
        "girafe@animal.com",
    )

    if ("cat@animal.com" in mails){
        println("We got the cat!")
    }

}