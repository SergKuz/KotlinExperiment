package com.kotlin.experiment

fun main() {
    val constant = "wow!"
    var notConstant = "I'll change it little later!";

    println(constant)
    justTry(notConstant)

    var listToReturn = getImmutableList()
    //listToReturn.add("Pascal") <- if you try to do that you'll met problems

    println(listToReturn)

    defaultArguments()
    defaultArguments(secondArgument = "changed")
    defaultArguments(2)
}

fun justTry( s :String) {
    println(s)
}