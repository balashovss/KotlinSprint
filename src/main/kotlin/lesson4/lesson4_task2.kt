package lesson4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100

fun main() {
    val firstShipWeight = 20
    val firstShipVolume = 80
    val secondShipWeight = 50
    val secondShipVolume = 100

    println(
        "Груз с весом $firstShipWeight кг и объемом $firstShipVolume л соответствует категории 'Average': " +
                "${
                    (firstShipWeight <= AVERAGE_MAX_WEIGHT) &&
                            (firstShipWeight > AVERAGE_MIN_WEIGHT) &&
                            (firstShipVolume < AVERAGE_MAX_VOLUME)
                }"
    )
    println(
        "Груз с весом $secondShipWeight кг и объемом $secondShipVolume л соответствует категории 'Average': " +
                "${
                    (secondShipWeight <= AVERAGE_MAX_WEIGHT) &&
                            (secondShipWeight > AVERAGE_MIN_WEIGHT) &&
                            (secondShipVolume < AVERAGE_MAX_VOLUME)
                }"
    )
}