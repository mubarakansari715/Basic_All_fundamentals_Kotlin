package com.example.kotlin_basic_fundamentals

/* Inheritance means you can access the fun and property of the parent class/base class.
kotlin having a by default all class is a final, so we can not be modified or inherit.
if you want to Inheritance the class use open keyword to make class public.
also maybe we want to access the base class fun, also you write open keyword to fun.
*/

fun main() {
    val ob = Car()
    ob.display()
    ob.display1()
    val ob1 = Bike()
    ob1.display1()

}

open class Vehicle {
    open var names = ""
    open var models = ""
    open fun display() {
        println("Car About".formattingString())
    }
    open fun display1() {
        println("Car About")
    }
}

class Car : Vehicle() {
    override var names = "Audi"
    override var models = " 805"

    override fun display1() {
        println("Car name is $names and Model is $models")
    }
}

class Bike : Vehicle() {
    override var names = "BMW"
    override var models = "1005C"

    override fun display1() {
        println("Bike name is $names and Model is $models")
    }
}