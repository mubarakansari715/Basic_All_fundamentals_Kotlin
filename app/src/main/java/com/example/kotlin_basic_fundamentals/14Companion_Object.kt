package com.example.kotlin_basic_fundamentals


/*this only one create
have some properties common for all objects of the class.
why we don't write companion object outside of class in kotlin???
Unlike Java or C#, Kotlin doesn't have static members or member functions.
If you need to write a function that can be called without having a class instance but
needs access to the internals of a class, you can write it as a member of a companion object
declaration inside that class. ...*/
fun main() {
    myClass.fdisplay()
}

class myClass() {
    companion object objs {
        fun fdisplay() {
            println("Hello companion object")
        }
    }
}

