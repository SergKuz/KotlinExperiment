package com.kotlin.experiment

fun rangeInNumbers(){

}

fun isNumber(i: Int): Boolean {

    return i in 0..9
}

fun isDigit(i: Char): Boolean {

    return i in '0'..'9'
}

fun isLetter(c :Char): Boolean{

    return c in 'a'..'z' || c in 'A'..'Z'
}

fun symbolRecognition(c :Char): String{

    when(c) {
        in '0'..'9' -> return "Its digit"
        in 'a'..'z' -> return "Its small letter"
        in 'A'..'Z' -> return "Its big letter"
        else -> return "I don't know what is that"
    }
}