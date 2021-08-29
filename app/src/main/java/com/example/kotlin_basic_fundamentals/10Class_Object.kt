package com.example.kotlin_basic_fundamentals

/*Object is the real-world entity. It has all the properties and methods declared in class.
Class : class is blue print of object
 */

fun main() {
    val ob = Class_Object()//where ob object name
    ob.display()
}

class Class_Object {
    // where Class_Object class name
    fun display() {
        println("Hello mr.ansari")
    }
}