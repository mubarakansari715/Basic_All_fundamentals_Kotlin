package com.example.kotlin_basic_fundamentals

fun main() {
    val name = "Mubarak"
    when (name) {
        "Mubarak" -> println("Name is Mubarak")
        "happy" -> println("Name is Happy")
        else -> println("Name not Found")
    }

    val num = 3
    when (num) {
        1 -> {
            println("Number is 1")
        }
        2 -> {
            println("Number is 2")
        }
        3 -> {
            println("Number is 3")
        }
        else -> "Number not found"
    }
}