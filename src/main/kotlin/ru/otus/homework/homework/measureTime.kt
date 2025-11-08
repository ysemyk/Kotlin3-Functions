package ru.otus.homework.homework

fun main() {
    val time = measureTime(::longRunningTask)
    println("Measured time: $time ms")
}

fun longRunningTask() {
    Thread.sleep(1000)
}

fun measureTime(funcToMeasure: () -> Unit): Long {
    val started = System.currentTimeMillis()
    funcToMeasure()
    val finished = System.currentTimeMillis()
    val elapsedTime = finished - started
    return elapsedTime
}