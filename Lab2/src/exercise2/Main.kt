package exercise2

fun MutableList<String>.merge(separator: String)  = println(this.joinToString(separator))

fun MutableList<String>.longest()  = println(this.maxByOrNull { it.length }.toString())

fun String.monogram() = println(this.split(" ").map { it[0] }.joinToString(""))

fun main() {
    //Problem 2.
    //Define an extension function that prints the monogram of a String containing the
    //firstname and lastname. Example: John Smith → JS
    "John Smith".monogram()

    //Define a compact extension function that returns the elements of a strings’ list joined by
    //a given separator!
    val list = arrayListOf("apple", "pear", "melon")
    val separator = "#"

    list.merge(separator)

    //Define a compact extension function for a strings’ list that returns the longest string!
    list.longest()
}