package lesson3

fun main() {
    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20
    var outputString = "$surname $name $patronymic, $age"

    println(outputString)
    surname = "Сидорова"
    age = 22
    outputString = "$surname $name $patronymic, $age"
    println(outputString)
}