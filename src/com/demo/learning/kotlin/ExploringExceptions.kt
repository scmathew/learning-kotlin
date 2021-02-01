package com.demo.learning.kotlin

import java.io.FileInputStream
import java.lang.ArithmeticException
import kotlin.concurrent.thread

fun main() {

    try {
        println(7/0)
    } catch (e : ArithmeticException) {
        println(e.localizedMessage)
    }

    // Unlike java - Not forced to catch a checked exception this throws, not even warned about it
    Thread.sleep(100)

    var result = try {
        divide(5, 0)
    } catch (e : Exception) {
        // When an exception occurs, return this value
        0
    }
}


// @Throws Doesn't force the caller to catch it, not really used unless you have java code interacting with this function
@Throws(InterruptedException::class)
fun divide(a: Int, b:Int) : Double {
    Thread.sleep(100)
    return a.toDouble() / b
}

fun printFile() {
    val input = FileInputStream("text.txt")

    // Try with resources equivalent in Kotlin
    input.use {
        // exception could be thrown here, the input would be closed
    }
}