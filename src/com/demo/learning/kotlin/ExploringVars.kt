package com.demo.learning.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    println("//  STRINGS ----------------------------------------------------------")
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

    println("\n//  Double ----------------------------------------------------------")
    val myDouble = 21.4

    // is = is instance of
    println("Is myDouble a Double? ${myDouble is Double}")

    // get type of var
    // in this example, myDouble is a kotlin.Double which same as Java Double with more functionality
    println("myDouble is a ${myDouble::class.qualifiedName}")

    // What java class the var is compiled down into, in this case its double (literal)
    println("my double java class is ${myDouble.javaClass}")

    println("\n//  Int/Integer ----------------------------------------------------------")

    val myInteger = myDouble.roundToInt()
    // kotlin.Int
    println("myInteger is a ${myInteger::class.qualifiedName}")

    // Does not work because trying to assign kotlin.Int to java Integer and does not work
    // val anotherInteger: Integer = 17

    // this does work
    val anotherInteger: Int = 17

    println("\n//  Other Kotlin Data Types ----------------------------------------------------------")
    val myFloat : Float = 21.7f
    val myLong : Long = 233L

    val myBool: Boolean = true

    // Don't need the new keyword to instantiate the obj
    val bd : BigDecimal = BigDecimal(17);

    val bd2: BigDecimal
    // the line below throws an error because you can't use an un-initialized value
    // println("VALUE BEFORE INIT $bd2")

    bd2 = bd.add(BigDecimal(1))
    print("VALUE AFTER INIT $bd2")
}