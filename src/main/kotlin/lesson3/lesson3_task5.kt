package lesson3

fun main() {
    val inputString = "D2-D4;0"
    val inputStringArray = inputString.split('-', ';')
    val moveTo = inputStringArray[0]
    val moveFrom = inputStringArray[1]
    val moveNumber = inputStringArray[2].toInt()

    println(moveTo)
    println(moveFrom)
    println(moveNumber)
}