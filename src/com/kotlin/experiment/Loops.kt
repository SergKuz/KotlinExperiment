package com.kotlin.experiment

// nice thing to work with indexes
fun usingIndexes(untilNumber: Int) {
    for (i in 0 until untilNumber) {
        print(i)
    }
    println()
}

fun calculateFactorial(untilNumber: Int) {
    var result = 0

    for (i in 0..untilNumber) { // i <= untilNumber
        result +=i
    }

    println(result)
}

