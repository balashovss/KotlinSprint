package lesson2

const val MINUTES_IN_HOURS = 60
fun main() {
    val hours = 9
    val minutes = 39
    val minutesInTrip = 457
    val endTimeMinutes = (minutes + minutesInTrip) % MINUTES_IN_HOURS
    val endTimeHours = hours + (minutes + minutesInTrip) / MINUTES_IN_HOURS

    println("End time is %02d:%02d".format(endTimeHours, endTimeMinutes))
}