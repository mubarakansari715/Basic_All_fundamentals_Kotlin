package com.example.kotlin_basic_fundamentals

/*
1. Inner class used keyword is inner
2. use: suppose we have many property outside the class, And we want to access those property in present class
    so those class we make inner.
3. inner keyword is provide to the access val or property outside of the class
*/

fun main() {
    val outClass = OutClass()
    val inClass = outClass.InClass()
    inClass.display()
}

class OutClass {
    val name = "Ansari"
    val a = 7
    fun hello() = println("Fun called")

    inner class InClass {
        fun display() {
            println("Inner class called")
            println("Hello Mr.$name and Number $a")
            println(hello())
        }

    }
}