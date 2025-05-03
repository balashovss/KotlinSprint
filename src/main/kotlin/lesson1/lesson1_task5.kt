package lesson1

fun main() {
    val seconds: Short = 6480
    val hoursTime: Short = (6480/3600).toShort()
    val minutesTime: Short = ((seconds - hoursTime*3600)/60).toShort()
    val secondsTime: Short = (seconds - hoursTime*3600 - minutesTime*60).toShort()
    println(String.format("%02d:%02d:%02d", hoursTime, minutesTime, secondsTime))
}