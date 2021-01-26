package com.demo.learning.kotlin

// When no return type is specified like here, assume return type of "Unit"
// which is the equivalent to "void" in Java.
// Unit is an object though, so that if you do call a func on the return of a
// "void" function you don't get a null pointer exception.
fun main(): Unit {
    printAString("PRINT THIS")

    // Optional params
    println(addTwoNumbers(7.3, 2.7))
    println(addTwoNumbers(7.3))

    // Using named parameters in the call
    printSomeMaths(two = 7.2, one = 2.2)
}

// Functions can exist outside of classes
// Called top-level functions
// public and static by default
// Has to be static always but can be made private
private fun printAString(value: String) {
    println(value)
}

// Long form
//fun addTwoNumbers(one: Double, two: Double) : Double {
//    return one + two
//}

// Single expression function, has to be one line,
// don't need the return keyword, can infer return type
fun addTwoNumbers(one: Double, two: Double = 2.7) =
        one + two



fun printSomeMaths(one: Double, two: Double) {
    // Parameters are vals, which means they are immutable. Not changables
    // one = 3.4

    println(" One + Two is: ${one + two}")
    println(" One - Two is: ${one - two}")

    // Only visible within this function
    fun functionWithinAFunction(a: String) {
        println("a")
    }
}

fun methodTakesALambda(input: String, action: (String) -> Int) {
    println(action(input))
}