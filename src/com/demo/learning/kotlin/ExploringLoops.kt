package com.demo.learning.kotlin

import com.demo.learning.kotlin.exercise.KotlinPerson

fun main() {
    var x: Int = 0

    // While + do while loops work exactly the same as in java
    while (x < 10) {
        //println(x)
        x++
    }

    val people =  ArrayList<KotlinPerson>()
    people.add(KotlinPerson(1L, "Mr", "Test", "Name", null))
    people.add(KotlinPerson(2L, "Ms", "Test2", "Name2", null))
    people.add(KotlinPerson(3L, "Mr", "Test3", "Name3", null))
    people.add(KotlinPerson(4L, "Mr", "Test4", "Name4", null))

    // for each
    for (person in people) {
        println(person)
    }

    // De-structure in for loop
    for ((id, title, firstName) in people) {
        println("$title $firstName has id: $id")
    }

    val peopleMap = HashMap<Int, KotlinPerson>()
    peopleMap.put(1, people[0])
    peopleMap.put(2, people[1])
    peopleMap.put(3, people[2])
    peopleMap.put(4, people[3])

    for ( (key, value) in peopleMap) {
        println("Value is : $value")
    }

    // Ranges
    for (i in 0..9) {
//        println(i)
    }
    (0..9).forEach { println(it) }
    println("-------------")
    (9 downTo 0).forEach { println(it) }
    println("-------------")
    (0 until 9).forEach { println(it) }
    println("-------------")
    (0 until 9 step 2).forEach { println(it) }
    println("-------------")
    ('A'..'F').forEach { println(it) }
    println("-------------")

}