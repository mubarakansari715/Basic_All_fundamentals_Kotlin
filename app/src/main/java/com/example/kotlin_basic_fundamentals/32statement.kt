package com.example.kotlin_basic_fundamentals

fun main() {
    println("Break statement")
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 3 && j == 1) {
                break
            }
        }
    }
    println("continue statement")

    for (k in 1..10) {
        if (k % 2 == 0) {
            continue
        }
        println(k)
    }
    println("repeat statement")

    repeat(3) {
        println(it)
    }

}