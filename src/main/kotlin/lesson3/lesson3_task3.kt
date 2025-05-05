package lesson3

fun main() {
    val number = 5
    var counter = 0
    println(
        """
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
        $number x ${++counter} = ${number * counter}
    """.trimIndent()
    )
}