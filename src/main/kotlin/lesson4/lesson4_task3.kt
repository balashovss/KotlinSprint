package lesson4

const val GOOD_HUMIDITY = 20
const val BAD_SEASON = "зима"
fun main() {
    val isSunny = true
    val isOpened = true
    val humidity = 20
    val season = "зима"
    val isConditionGood = isSunny &&
            isOpened &&
            humidity == GOOD_HUMIDITY &&
            season != BAD_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionGood")
}