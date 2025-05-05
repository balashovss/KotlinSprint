package lesson2

fun main() {
    val numberOfWorkers = 50
    val workerFee = 30000
    val numberOfInterns = 30
    val internFee = 20000
    val workersSummaryFee = numberOfWorkers * workerFee
    val internsSummaryFee = numberOfInterns * internFee
    val summaryFee = workersSummaryFee + internsSummaryFee
    val medianFee = summaryFee / (numberOfWorkers + numberOfInterns)

    println(workersSummaryFee)
    println(summaryFee)
    println(medianFee)
}