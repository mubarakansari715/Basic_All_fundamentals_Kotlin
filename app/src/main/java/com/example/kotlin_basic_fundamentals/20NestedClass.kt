package com.example.kotlin_basic_fundamentals

import android.app.Person

/*
1. Nested class mean is, We have multiple class in one parent class
 */
fun main() {
    val p = Parent.Child()
    p.display()
   Parent.Son().display()
}

class Parent {
    class Child {
        fun display() {
            println("This is Child called")
        }
    }
    class Son {
        fun display() {
            println("This is Son called")
        }
    }
}