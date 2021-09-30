package exercise1

import exercise1.DictionaryProvider.Companion.createDictionary

fun main() {
    //Problem 1.
    val dict: IDictionary = ListDictionary //TreeSetDictionary
    println("Number of words: ${dict.size()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }

    val dictionary : IDictionary = createDictionary(DictionaryType.HAS_SET)
    println("\n\nNumber of words: ${dictionary.size()}")
}