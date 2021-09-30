package exercise3

import kotlin.collections.ArrayList
import kotlin.math.roundToInt

//Define an extension function that checks whether the year of the date is a leap year
fun Date.isLeapYear() : Boolean {
    var leapYear = false

    if (this.year % 4 == 0) {
        leapYear = if (this.year % 100 == 0) {
            this.year % 400 == 0
        } else
            true
    }
    return leapYear
}

//Define an extension function that checks whether the date is a valid one!
fun Date.validateDate() : Boolean {
    var isValid = false
    if (this.year > 0) {
        if (this.month in 1..12) {
            if (this.day in 1..31) {
                isValid = true
            }
        }
    }
    return isValid
}

fun createRandomIntBetween(start: Int, end: Int): Int {
    return start + (Math.random() * (end - start)).roundToInt()
}

fun createRandomDate(start : Int, end : Int) : Date {
    val day = createRandomIntBetween(1, 28);
    val month = createRandomIntBetween(1, 12);
    val year = createRandomIntBetween(start, end);
    return Date(year, month, day)
}

fun printRandomDateList(list: List<Date>) {
    list.forEach { println(it) }
}

fun main() {
    val date = Date()
    println("Is leap year: " + date.isLeapYear())

    var validDates = 0
    val randomDatesList : MutableList<Date> = ArrayList()

    while (validDates <= 10) {
        val randomDates = createRandomDate(1900,2000)
        if (randomDates.validateDate()) {
            validDates++
            randomDatesList.add(randomDates)
        } else {
            println(randomDates)
        }
    }

    //Print the list. Use forEach in order to print each element to a new line
    //randomDatesList.forEach { println(it) }
    printRandomDateList(randomDatesList)

    //Sort the list by defining a natural ordering for the Date class (implement the
    //Comparable<Date> interface!) Print the sorted list.
    println("Sorted list:")
    randomDatesList.sort()
    printRandomDateList(randomDatesList)

    //Reverse the sorted list, then print it.
    println("Reversed list:")
    randomDatesList.reverse()
    printRandomDateList(randomDatesList)

    //Sort the list by using a custom ordering (use the Comparator<Date> interface!). Print
    //the sorted list.
    val date1 = Date(1990,12,12)
    val date2 = Date(1990,11,10)
    print(date1 == date2)
}