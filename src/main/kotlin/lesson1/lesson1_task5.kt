package lesson1

fun main() {
    val seconds: Short = 6480
    val secondsInMinute = 60
    val minutesInHour = 60
    val hoursTime: Short = (seconds / (secondsInMinute * minutesInHour)).toShort()
    val minutesTime: Short = ((seconds / secondsInMinute) % minutesInHour).toShort()
    val secondsTime: Short = (seconds % secondsInMinute).toShort()

    println("%02d:%02d:%02d".format(hoursTime, minutesTime, secondsTime))
}