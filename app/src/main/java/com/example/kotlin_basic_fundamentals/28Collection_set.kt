package com.example.kotlin_basic_fundamentals

/*
set Collection
1.Duplicate elements are not allowed in sets.
2.An unordered collection of elements convert to oder.
 */

fun main() {
    //set
    val setof = setOf<Int>(1, 2, 2, 3, 6, 5, 4)
    println("setList ${setof.sorted()}")
    //mutable set
    val mutableset = mutableSetOf(1, "Happy", "Mubarak", 22)
    println(mutableset)
    mutableset.add("Ansari")
    println(mutableset)
    mutableset.remove(22)
    println(mutableset)


}