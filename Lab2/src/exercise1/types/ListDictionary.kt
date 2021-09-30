package exercise1

import java.io.File
import java.io.InputStream

enum class DictionaryType {
    ARRAY_LIST,
    TREE_SET,
    HAS_SET
}

object ListDictionary : IDictionary {
    private var words: MutableList<String> = ArrayList()

    init {
        val input : InputStream = File("Lab2/src/exercise1/${IDictionary.filename}").inputStream()
        input.bufferedReader().forEachLine { add(it) }
    }

    override fun add(dict: String): Boolean {
        if (!find(dict)) {
            words.add(dict)
            return true
        }
        return false
    }

    override fun find(dict: String): Boolean {
        if (words.find { it.contains(dict) } != null) {
            return true
        }
        return false
    }

    override fun size(): Int {
        return words.size
    }
}