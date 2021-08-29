package com.example.kotlin_basic_fundamentals

/*
 1. Enum class create using enum keyword
 2. use : Suppose we have set of Constant, mean this type of value we never change in future
*/

fun main() {
    val enumClass = EnumClass.MEDIUM
    println(enumClass)
    println(enumClass.enFun())

    for (i in EnumClass.values())
        println(i)
}

enum class EnumClass() {
    LARGE, MEDIUM, SMALL;

    fun enFun(): Unit {
        println("Pizza is ${MEDIUM}")
    }
}