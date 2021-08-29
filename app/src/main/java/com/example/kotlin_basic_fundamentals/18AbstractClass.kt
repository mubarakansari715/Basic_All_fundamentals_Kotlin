package com.example.kotlin_basic_fundamentals

/*
1. Used to hide data
2. Abstract Class used keyword is abstract
3. In abstract class compulsory  implement all methods
4. suppose we defined abstract fun or method, those class compulsory to defined abstract
5. abstract class can not create instance(object)
6. used for common method
 */
fun main() {
//val ob3 =abShape() //we can never create a instanceof abClass bcz its abstract
    val ob = Circle()
    ob.display()
    val ob1 = Square()
    ob1.display()
}

abstract class abShape {
    abstract fun display()
}

class Circle : abShape() {
    override fun display() {
        println("This is Circle Class")
    }
}

class Square : abShape() {
    override fun display() {
        println("This is Square Class")
    }
}