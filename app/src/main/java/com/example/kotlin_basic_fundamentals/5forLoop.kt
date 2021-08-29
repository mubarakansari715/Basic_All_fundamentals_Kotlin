package com.example.kotlin_basic_fundamentals

fun main() {
    val num = 5

    for (i in 1..num) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (k in 1..num){
        for (k in k..4){
            print("*")
        }
        println()
    }
}