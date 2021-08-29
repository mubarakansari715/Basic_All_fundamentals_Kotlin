package com.example.kotlin_basic_fundamentals

/*
Null Safety
In programming world when a variable doesn't refer to anything then it is considered as null.
If we try to use this variable then we will get NullPointerException or NPE.
==> used to handle nullable operations
 */

fun main() {
    var name: String? = "Ansari" //safe cast
    println("Length ${name?.length}")

    println("!! Operator ${name!!.length}")//!! operator

    name = null
    println("Evils ?: operator name is : ${name ?: null}")//Evils operator

}
