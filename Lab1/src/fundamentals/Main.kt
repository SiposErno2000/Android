package fundamentals

import java.util.*

fun feladat1() : String {
    val n = 2
    val m = 3

    val message = "$n + $m = ${n + m}"
    return message
}

fun feladat2() {
    //a
    val list = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    list.forEach { print("$it ") }
    println()

    //b
    list.filter { it.startsWith("T") }.forEach { print("$it ") }
    println()

    //c
    list.filter { it.contains("e") }.forEach { print(("$it ")) }
    println()

    //d
    list.filter { it.length == 6 }.forEach { print(("$it ")) }
    println()
}

fun feladat3(num : Int) : Boolean {

    var flag = true

    for (i in 2..num / 2) {
        if ( num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}

fun feladat4(string : String) {
    val encode = Base64.getEncoder().encodeToString(string.toByteArray())
    val decode = String(Base64.getDecoder().decode(encode))

    println("$encode $decode")
}

fun feladat5(list: ArrayList<Int>) = list.filter { it % 2 == 0 }.forEach { print("$it ") }

fun main() {

    //fel1
    println(feladat1())

    //fel2
    feladat2()

    //fel3
    println(feladat3(17))

    //fel4
    feladat4("alma")

    //fel5
    val list2 = arrayListOf(1, 2, 5, 3, 6)
    feladat5(list2)
}