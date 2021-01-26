package com.demo.learning.kotlin


fun main() {
    val customer = Customer("Santosh", "1 best street", 56)
    customer.age = 99
    println("${customer.name} is ${customer.age} years old\n")

    val customer2 = Customer("John", 11)
    println("${customer2.name} is ${customer2.age} years old\n")


    val customer3 = AnotherAlternativeCustomer("FirstName", 20)
    customer3.approved = true
    println("${customer3.name} is ${customer3.age} years old")
    println("Next year ${customer3.name} is ${customer3.nextAge} years old\n")

    val customer4 = AnotherAlternativeCustomer.getInstance()
    println(customer4)

    val customer5 = Customer("New Name", 56)
    println(customer5.toString() + "\n")


    val customer6 = customer5.copy(name = "New Name Twin")
    println(customer6.toString() + "\n")

    // Destructuring
    val (name, address, age) = customer6
    println(name)


}



// Data class get built in toString, hashCode, and equals method
// also get the copy function
// also get destructuring
data class Customer (val name: String, val address: String, var age: Int) {

    // This is a secondary constructor
    // Has to call the primary constructor
    constructor(name: String, age: Int) : this(name, "", age) {
        println("Secondary constructor")
    }

    init {
        println("Run on primary constructor")
    }
}

// Classes, fields are public by default
// The parameters are fields
// In the parentheses in the primary constructor
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

class AnotherAlternativeCustomer (val name: String, var age: Int, val address: String = "") {
    var approved: Boolean = false

    // custom setter
    // Field is approved because its right under it ??
    set(value) {
        if (age >= 21) {
            field = value
        } else {
            println("You can't approve a customer under 21 years of age.")
        }
    }

    // Custom get, for a field that doesn't exist
    val nextAge: Int
    get() = age + 1

    fun upperCaseName() =
            name.toUpperCase()

    // override toString func
    override fun toString(): String {
        return "$name $address $age"
    }

    // Everything in this block is static
    // This is for when you want static functions inside a class
    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Micky", 22, "Some Address")
    }
}


class Book (val id: Long, val title: String = "Default Title")