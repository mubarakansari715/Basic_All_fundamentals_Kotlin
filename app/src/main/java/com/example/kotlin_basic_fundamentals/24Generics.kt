package com.example.kotlin_basic_fundamentals

/*
Generics in kotlin, we have general form
form like (Int, String, Double)
*/

fun main() {
    val ob = GenericsClass(123)
    ob.printData("Ansari")
}

class GenericsClass<T>(var data: T) {
    fun printData(name :String){
        println("Hello $name and Data $data")
    }
}

