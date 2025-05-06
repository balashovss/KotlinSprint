package lesson3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveCounter = 1
    var stringToSend = "$moveFrom-$moveTo;$moveCounter"

    println(stringToSend)

    moveFrom = "D2"
    moveTo = "D${moveFrom[1].code - '0'.code + 1}"
    moveCounter++
    stringToSend = "$moveFrom-$moveTo;$moveCounter"

    println(stringToSend)
}