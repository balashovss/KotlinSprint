package lesson3

fun main() {
    val inputString = "D2-D4;0"
    val moveTo = inputString.substringBefore('-')
    val moveFrom = inputString
        .substringAfter('-')
        .substringBefore(';')
    val moveNumber = inputString
        .substringAfter(';')
        .toInt()

    println(moveTo)
    println(moveFrom)
    println(moveNumber)
}