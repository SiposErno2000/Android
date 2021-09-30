package exercise1

interface IDictionary {

    companion object {
        val filename = "words.txt"
    }
    fun add(dict : String) : Boolean
    fun find(dict : String) : Boolean
    fun size(): Int
}