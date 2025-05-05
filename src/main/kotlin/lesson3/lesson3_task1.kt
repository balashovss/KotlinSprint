package lesson3

const val COMA = ", "

fun main() {
    val userName = "BalashovSS"
    val morningGreeting = "Good day"
    val dayGreeting = "Good evening"
    var greeting = morningGreeting + COMA + userName

    println(greeting)

    greeting = dayGreeting + COMA + userName

    println(greeting)
}