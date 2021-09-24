package fundamentals

import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

fun stringTemplateExample(): String {
    val n = 2
    val m = 3

    return "$n + $m = ${n + m}"
}

fun listFunctions() {
    //Use a for loop that iterates over the list and prints the list to the standard output.
    val list = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    list.forEach { print("$it ") }
    println()

    //Use a list filter to print the days starting with letter ‘T’
    list.filter { it.startsWith("T") }.forEach { print("$it ") }
    println()

    //Use a list filter to print the days containing the letter ‘e’
    list.filter { it.contains("e") }.forEach { print(("$it ")) }
    println()

    //Use a list filter to print all the days of length 6 (e.g. Friday)
    list.filter { it.length == 6 }.forEach { print(("$it ")) }
    println()
}

//Write a function that checks whether a number is prime or not.
fun isPrime(num : Int) : Boolean {
    var flag = true

    for (i in 2..num / 2) {
        if ( num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}

//Write an encode and a corresponding decode function that encodes and respectively
//decodes the characters of a string.
fun encodeAndDecode(string : String) {
    val encode = Base64.getEncoder().encodeToString(string.toByteArray())
    val decode = String(Base64.getDecoder().decode(encode))

    println("Encode:$encode \nDecode:$decode")
}

//Write a compact function that prints the even numbers from a list.
fun compactFunction(list: ArrayList<Int>) = list.filter { it % 2 == 0 }.forEach { print("$it ") }

fun mapFunctions() {
    val map = mapOf("monday" to 1, "Tuesday" to 2)

    //Double the elements of a list of integers and print it.
    val doubleElements = map.mapValues { it.value * 2 }
    println(doubleElements)

    //Print the days of week capitalized (e.g. MONDAY for Monday)
    val  capitalizedDays = map.mapKeys { it.key.toUpperCase() }
    println(capitalizedDays.keys)

    //Print the first character of each day capitalized (e.g. m for Monday)
    val firstCharacters = map.mapKeys { it.key.capitalize() }
    println(firstCharacters.keys)

    //Print the length of days (number of characters, e.g. Monday → 6)
    map.forEach { println("${it.key} -> ${it.key.length}") }

    //Compute the average length of days (in number of characters)
    println("The average length of days (in number of characters): ${map.values.average()}")
}

fun mutableListFunctions() {
    // Remove all days containing
    //the letter ‘n’, then print the mutable list
    val mutableList = mutableListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    mutableList.removeAll{ it.contains("n") }
    println(mutableList)

    //Print each element of the list in a new line together with the index of the element (convert
    //the list to list with index using the withIndex() function!)
    mutableList.withIndex().forEach { println("Item at ${it.index} is ${it.value}") }
    println(mutableList)

    //Sort the result list alphabetically!
    mutableList.sort()
    println(mutableList)
}

fun arrayFunctions() {
    //Generate an array of 10 random integers between 0 and 100, and use forEach to print
    //each element of the array in a new line.
    val from = 0
    val to = 100
    val list = IntArray(10) { Random.nextInt(to - from) + from }.asList()
    list.forEach { print("$it ") }
    println()

    //Print the array sorted in ascending order!
    println("The array sorted in ascending order ${list.sorted()}")

    //Check whether the array contains any even number!
    println("The array contains any even number:${list.any { it % 2 == 0 }}")

    //Check whether all the numbers are even!
    println("All the numbers are even:${list.all { it % 2 == 0 }}")

    //Calculate the average of generated numbers and print it using forEach!
    println("Average:${list.average()}")
}

fun main() {

    //fel1
    println("String template: ${stringTemplateExample()}")
    println("*******************************************")

    //fel2
    listFunctions()
    println("*******************************************")

    //fel3
    for (i in 5.. 10) {
        println("$i is prime: ${isPrime(i)}")
    }
    println("*******************************************")

    //fel4
    encodeAndDecode("alma")
    println("*******************************************")

    //fel5
    val list2 = arrayListOf(1, 2, 5, 3, 6)
    compactFunction(list2)
    println("\n*******************************************")

    //fel6
    mapFunctions()
    println("*******************************************")

    //fel7
    mutableListFunctions()
    println("*******************************************")

    //fel8
    arrayFunctions()
}