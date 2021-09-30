package exercise1

import exercise1.types.HasSetDictionary
import exercise1.types.TreeSetDictionary

class DictionaryProvider() {

    companion object {
        fun createDictionary(type: DictionaryType): IDictionary {
            return when (type) {
                DictionaryType.ARRAY_LIST -> ListDictionary
                DictionaryType.TREE_SET -> TreeSetDictionary
                DictionaryType.HAS_SET -> HasSetDictionary
            }
        }
    }
}