package lesson5

import kotlin.random.Random

const val MAX_NUMBER = 100

fun main() {
    val firstValue = Random.nextInt() % MAX_NUMBER + MAX_NUMBER
    val secondValue = Random.nextInt() % MAX_NUMBER + MAX_NUMBER

    println("Чтобы войти в приложение решите пример $firstValue + $secondValue: ")
    try {
        val userResponse = readln().toInt()
        if (userResponse == firstValue + secondValue) {
            println("Добро пожаловать!")
        } else {
            println("Доступ запрещён.")
        }
    } catch (_: NumberFormatException) {
        println("Доступ запрещён. Нелегальный вводН")
    }

}