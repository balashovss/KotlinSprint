package lesson2

const val PERCENTAGE = 100
fun main() {
    val numberOfCrystals = 7
    val numberOfIron = 11
    val buffPercent = 20

    println("Bonus crystals:" + (numberOfCrystals * buffPercent) / PERCENTAGE)
    println("Bonus irons:" + (numberOfIron * buffPercent) / PERCENTAGE)
}