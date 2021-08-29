package com.example.kotlin_basic_fundamentals

import java.lang.Exception

/*
Exception is nothing but we can say error, Exception is runtime occurring.
We can solve exception using try and catch and finally block
*/

fun main() {
    divClass(5, 0)
    //throw
    val password: String = "Happy"
    if (password.length < 6) {
        println("Password is ${password}")
        throw Exception("Password is less then 6 length")
    }
}

fun divClass(a: Int, b: Int) {
    try {
        println(" Divide by zero : ${a / b}")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Finally Block execute value is $a and $b")
    }
}