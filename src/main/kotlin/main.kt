fun main(args: Array<String>) {
    println("What's your age?")
    val age = readLine()
    val myStringNumber: String = age.toString();
    val number: Int = myStringNumber.toInt()
    println(number)
    when (number) {
        in 1..3 -> println("You are a toddler!")
        in 4..10 -> print("You are a kid!")
        in 11..17 -> print("You are a teenager!")
        in 18..100 -> print("You are an adult!")
        else -> println("You are not welcome here!")
    }
}