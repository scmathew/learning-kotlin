package com.demo.learning.kotlin

fun main(args: Array<String>) {

    // Create and assign String var, no semi-colon necessary
    var name: String = "FirstName"
    // Can infer variable type, don't need to specify String when assigning the value
    var otherName = "test name"

    // val = value, immutable
    val surname: String = "LastName"

    System.out.println("Java Way");
    // Part of default kotlin.io package
    println("Kotlin Way")

    // String templating
    println("Hello $name $surname")
    // Need curly braces for an expression
    // Also in Kotlin length is a property not a function
    println("Your first name has ${name.length} characters")
    // Escaping $
    println("Your product cost \$name")

    // Multi line strings
    // trim margin tells it to ignore the spaces coming before the pipe char
    // trim margin returns new string, doesn't alter
    val story = """ it was a day
        | next line
        | oh my another day, another line
    """.trimMargin("|")
    println(story)

    // After last occurrence of day, replace string
    val newStory = story.replaceAfterLast("day", " another line v2")
    println(newStory)
}