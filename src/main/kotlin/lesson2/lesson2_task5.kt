package lesson2

import kotlin.math.pow

fun main() {
    val startingMoney = 70000
    val interestRate = 0.167
    val finalMoney = (1 + interestRate).pow(20) * startingMoney

    println("%.3f".format(finalMoney))
}