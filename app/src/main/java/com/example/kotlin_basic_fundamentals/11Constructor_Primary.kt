package com.example.kotlin_basic_fundamentals

/*There are two types of constructors in Kotlin:
1.Primary Constructor(simple)
2.Secondary Constructor(use constructor as a key)
*/

fun main() {
    val ob = Mobile("iPhone", "12 Pro", 15000f, 2000f)
    ob.printDetails()
    println("Total price is : ${ob.totalPrice()}".formattingString())
}

class Mobile(val brand: String, val model: String, val mrp: Float, val discount: Float) {
    fun printDetails() {
        println("\tMobile Details".formattingString())//formathingString called from extension practical No: 25 see
        println("Name : $brand")
        println("Model : $model")
        println("MRP : $mrp")
        println("Discount : $discount")
    }

    fun totalPrice(): Float {
        return (mrp - discount)
    }
}

