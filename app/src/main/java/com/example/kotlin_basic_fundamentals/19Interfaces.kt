package com.example.kotlin_basic_fundamentals

/*
1. Interface class used keyword is interface
2. Interface is similar to the abstract class
3. Its contains abstract methods
4. differance between abstract class and interface is a abstract class can not store states.
5. Its not require to implement all interface class
6. Used: You use an interface to define a protocol of
    behavior that can be implemented by any class anywhere in the class hierarchy
 */
fun main() {
    val c = C()
    c.display()
    c.display1()

}

interface A {
    fun display() {
        println("A")
    }
}

interface B {
    fun display1() {
        println("B")
    }
}

class C : A, B {
    override fun display() {
        super.display()
        println("A is Called")
    }

    override fun display1() {
        super.display1()
        println("B is Called")
    }

}