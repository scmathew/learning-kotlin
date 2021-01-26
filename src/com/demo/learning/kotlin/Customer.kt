package com.demo.learning.kotlin


fun main() {
    val customer = Customer("Santosh", "1 best street", 56)
    customer.age = 99
    println("${customer.name} is ${customer.age} years old")

    val customer2 = Customer("John", 11)
    println("${customer2.name} is ${customer2.age} years old")
}

// Classes, fields are public by default
// The parameters are fields
class Customer (val name: String, val address: String, var age: Int) {

    // This is a secondary constructor
    // Has to call the primary constructor
    constructor(name: String, age: Int) : this(name, "", age) {
        println("Secondary constructor")
    }

    init {
        println("Run on primary constructor")
    }
}

// This short form is called a primary constructor
class Book (val id: Long, val title: String)