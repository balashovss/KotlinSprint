package lesson4

const val IS_SUNNY = true
const val IS_OPENED = true
const val GOOD_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    val isSunny = IS_SUNNY
    val isOpened = IS_OPENED
    val humidity = GOOD_HUMIDITY
    val season = BAD_SEASON
    val isConditionGood = isSunny &&
            isOpened &&
            humidity == GOOD_HUMIDITY &&
            season != BAD_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionGood")
}