package com.demo.learning.kotlin

import java.math.BigDecimal
import java.util.*


fun main() {
    // Any in Kotlin = Java Object
    var result: Any

    val randomNumber = Random().nextInt(3)

    if (randomNumber == 1) {
        result = BigDecimal(30)
    } else {
        result = "hello"
    }

    println("Result is currently $result")

    if (result is BigDecimal) {
        // Kotlin has smart casting
        // which means because we do this explicit check for BigDecimal here
        // Kotlin automatically casts to BigDecimal
        result = result.add(BigDecimal(47))
    } else {
        // no explicit check here so we have to cast
        val tempResult : String = result as String;
        result = tempResult.toUpperCase();
    }

    println("Result is currently $result")

}