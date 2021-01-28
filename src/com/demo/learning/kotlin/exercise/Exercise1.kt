package com.demo.learning.kotlin.exercise

import java.util.*

data class KotlinPerson(
        val id: Long,
        val title: String,
        val firstName: String,
        val surname: String,
        val dateOfBirth: Calendar?
) {

    var favoriteColor: String? = null


    fun getLastLetter(a : String) : String {
        return a.takeLast(1)
    }

    fun getUppercaseColor() : String {
        // if favorite color is null, return "" ?
        // because of the "?" operator
        return favoriteColor?.toUpperCase() ?: ""
    }

    fun getLastLetterOfColor() : String {
        // return if (favoriteColor == null) "" else getLastLetter(favoriteColor)

        // where it = favoriteColor, let allows you call a lambda on the object
        // don't love this syntax prefer the if statement above
        return favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    fun getColorType() : String {
        val color = getUppercaseColor()
//         if (color == "") {
//             return "empty"
//         } else if (color == "RED" || color == "BLUE" || color == "GREEN") {
//             return "RGB"
//         } else {
//             return "other"
//         }

        // shorter way of doing the above
        // similar to a switch but doesn't need a default block
        return when (color) {
            "" -> "empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }
    }

    val safeAge: Int
        get() {
            // Elvis operator, similar to ternary
            // return age if not null, else return -1
            return age ?: -1
        }

    val age: Int?
        get() = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth == null) return null

            val today: Calendar = GregorianCalendar()
            val years: Int = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

            val flag = dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)

            // if in ternary-ish form
            // no actual ternary operator in Kotlin
            return if(flag) years - 1 else years

            // Long version
//            if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) {
//                return years - 1
//            } else {
//                return years
//            }
        }
    }

    override fun toString(): String {
        return "$title $firstName $surname"
    }
}

fun main() {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3))
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", null)
    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988, 5, 3))}")

    val olderPerson = if (john.safeAge > jane.safeAge) john else jane
    println("The older person is $olderPerson")
}