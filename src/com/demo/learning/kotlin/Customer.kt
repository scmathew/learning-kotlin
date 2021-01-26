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
// In the parentheses in the primary constructor
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

class AlternativeConstructor (val name: String, var age: Int) {
    // Can have combo of fields in primary constructor and code block
    var address: String

    // Can initialize address val in-line or through init block
    init {
        address = ""
    }

    // Secondary constructor, use primary constructor
    // and set field outside of primary constructor
    constructor(name: String, address: String, age: Int): this(name, age) {
        this.address = address
    }

}

class Book (val id: Long, val title: String = "Default Title")