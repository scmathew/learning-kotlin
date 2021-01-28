package com.demo.learning.kotlin

fun main() {
    //Immutable collections

    // its just an arraylist under the hood, so the compiler is what is preventing changes
    val color = listOf("Red", "Green", "Blue")
    println(color::class.qualifiedName)

    val days = mutableListOf("Monday", "Tuesday")

    // Sets
    val months = setOf("Jan") // Immutable
    val months2 = mutableSetOf("Feb")

    // Maps
    val webColors = mapOf("red" to "ff0000") // Immutable
    val webColors2 = mutableMapOf<String, String>()

    //Arrays - Object that acts like a simple collection
    // Arrays are always mutable, they are of a fixed size
    val intArray : Array<Int> = arrayOf(1, 2, 3)
    intArray.set(0, -4)
    intArray[1] = 77
}