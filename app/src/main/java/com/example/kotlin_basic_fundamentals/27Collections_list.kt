package com.example.kotlin_basic_fundamentals

/*
What are collections?
A Collection is a group of objects of same type. The objects inside a collection are known as elements or items.
There is Two types
1. Immutable Collection (Read only)(listOf, setOf, mapOf)
2. Mutable Collection (Both read and write)(mutableListOf, mutableSetOf,mutableMapOf)
Lists are:
1.An ordered collection of elements.
2.The ordered is maintained through indices (same as arrays).
3.An element can occur more than one time in a list.
4.The mutable list can be considered as a dynamic array whose size can be changed.
 */

fun main() {

    //lsitOf
    val listof = listOf(1, "Ansari", 2, "Mubarak")
    println(listof)
    //odering
    val listof1 = mutableListOf<Int>(1,2,2,3,6,5,4)
    println("List ${listof1.sorted()}")
    //matablelistOf
    val matablelistOf = mutableListOf(1, "Ansari", 2, "Mubarak")
    println(matablelistOf)
    //add element
    matablelistOf.add("Happy")
    println(matablelistOf)
    //remove element
    matablelistOf.remove(2)
    println(matablelistOf)
    // clear list
    matablelistOf.clear()
    println(matablelistOf)
    println()
    val numbers = mutableListOf("one", "two", "three", "four")
    val reversedNumbers = numbers.asReversed()
    println(reversedNumbers)
}