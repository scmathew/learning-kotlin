package com.demo.learning.kotlin

fun main() {
    // By default vars can't contain a null value
    // var name: String = null

    // ? means it can be null
    var nullableString: String? = null

    // Will not compile, when trying to call a func on the null var
    // println(nullableString.toUpperCase())

    // this does work - need the "?"
    // if nullableString had a non-null string value, then it would actually print out the
    // string to uppercase else return null and don't call toUpperCase
    println(nullableString?.toUpperCase())


    nullableString = "Real value"
    // Now that something has been assigned, you can call func on it without "?"
    println(nullableString.toUpperCase())


    var nullableString2: String? = null
    // !! Says this value is non-null, will compile ("Trust me bro")
    // Can cause a null-pointer with this, use with caution
    // println(nullableString2!!.toUpperCase())


    // Inferred type is "Nothing"
    var noTypeVar = null

    // Variable of type nothing which means you can't ever give it a value
    // noTypeVar = "Hello"

}