package lesson4

const val MIN_SQUAD = 55
const val MAX_SQUAD = 70
const val MIN_FODD_CRATES = 50

fun main() {
    try {
        println("Введите поврежден ли корабль(true/ false): ")

        val isBroken = readln().toBoolean()

        println("Введите количество членов экипажа: ")

        val numberOfSquad = readln().toInt()

        println("Введите количество ящиков с провизией: ")

        val numberOfCrates = readln().toInt()

        println("Введите хорошая ли погода(true/ false): ")

        val isGoodWeather = readln().toBoolean()

        val result = !isBroken && numberOfSquad in MIN_SQUAD..MAX_SQUAD && numberOfCrates > MIN_FODD_CRATES ||
                isBroken && numberOfSquad == MAX_SQUAD && numberOfCrates >= MIN_FODD_CRATES && isGoodWeather

        println("Корабль может отправится в плавание: $result")
    }
    catch (_: NumberFormatException) {
        println("Невалидное число")
    }
}