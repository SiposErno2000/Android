package exercise3

import java.util.*

data class Date(val year : Int = Calendar.YEAR, val month : Int = Calendar.MONTH, val day : Int = Calendar.DAY_OF_MONTH) : Comparable<Date>, Comparator<Date> {
    override fun compareTo(other: Date): Int {
        return if (this.year < other.year) {
            -1
        } else if (this.year > other.year) {
            1
        } else if (this.month < other.month) {
            -1
        } else if (this.month > other.month) {
            1
        } else if (this.day < other.day) {
            -1
        } else if (this.day > other.day) {
            1
        } else {
            0
        }
    }

    override fun compare(o1: Date?, o2: Date?): Int {
        if(o1 == null || o2 == null){
            return 0;
        }
        return o1.year.compareTo(o2.year)
    }
}