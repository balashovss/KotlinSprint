package lesson2

fun main() {
    val mark1 = 3
    val mark2 = 4
    val mark3 = 3
    val mark4 = 5
    val numberOfStudents = 4
    val mediumMark = (mark1 + mark2 + mark3 + mark4) / numberOfStudents.toFloat()

    println("%.2f".format(mediumMark))
}