package com.demo.learning.kotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.*
import kotlin.test.assertEquals

class AgeCalculation() {


    fun getAge(dateOfBirth : Calendar): Int {
        val today = Calendar.getInstance()

        if (dateOfBirth.timeInMillis > today.timeInMillis) throw IllegalArgumentException()

        val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
        return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR)) {
            years - 1
        } else {
            years
        }
    }
}

class AgeCalculationTests() {

    @Test
    fun checkAgeWhenBornToday() {
        assertEquals(0, AgeCalculation().getAge(Calendar.getInstance()))
    }

    @Test
    fun checkAgeWhenBorn1000DaysAgo() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, -1000)

        assertEquals(2, AgeCalculation().getAge(date))
    }

    @Test
    fun checkAgeWhenBorn10aysInTheFuture() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, 10)

        assertThrows<IllegalArgumentException> { AgeCalculation().getAge(date) }
    }


}