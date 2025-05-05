package lesson2

import kotlin.math.pow

const val INTEREST_RATE = 0.167
fun main() {
    val startingMoney = 70000
    val years = 20
    val finalMoney = (1 + INTEREST_RATE).pow(years) * startingMoney

    println("%.3f".format(finalMoney))
}