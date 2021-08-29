package com.example.kotlin_basic_fundamentals

/*
Data class is most important topic any lang
1. Data class create using data keyword
2. Data keyword have a inside getter and setter method
3. Data class used for handling the data
4. if we not use data keyword, those class return class String or hashcode
5. hashcode used for store address of data
*/

fun main() {
    val data = PersonInfo("Ansari",20)
    val data1 = PersonInfo("Ansari",20)
    println(data)
    println(data.hashCode())
    println(data1.hashCode())
    println(data == data1)
}
data class PersonInfo(val names:String, val age:Int)