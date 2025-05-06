package lesson4

const val NUMBER_OF_TABLES = 13

fun main() {
    val todaysBooked = NUMBER_OF_TABLES
    val tommorowBooked = 9

    println(
        "Доступность столиков на сегодня: ${todaysBooked < NUMBER_OF_TABLES}\n" +
                "Доступность столиков на завтра: ${tommorowBooked < NUMBER_OF_TABLES}"
    )
}