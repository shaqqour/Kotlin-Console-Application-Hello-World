fun main(args: Array<String>) {
    println("What's your name?")
    val name = readLine()
    when (name) {
        "Shaqqour" -> println("You are so welcome $name. We are glad to have you with us!")
        "Ali", "Hiba" -> println("Hello $name!")
        else -> println("You are not welcome here!")
    }
}