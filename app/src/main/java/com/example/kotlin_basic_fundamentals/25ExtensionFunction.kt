package com.example.kotlin_basic_fundamentals

/*
Kotlin provides the facility to add new functionality to already existing classes.
For this, there is no need to inherit them. It can be achieved through special declaration called extensions.
 */

fun main() {
    println("My name is Mubarak".formattingString())
}

fun String.formattingString(): String {
    return "--------------------\n$this\n--------------------"
}