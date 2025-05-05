package lesson3

fun main() {
    val userName = "BalashovSS"
    val morningGreeting = "Good day"
    val dayGreeting = "Good evening"
    var greeting = "$morningGreeting, $userName"

    println(greeting)

    greeting = "$dayGreeting, $userName"

    println(greeting)
}