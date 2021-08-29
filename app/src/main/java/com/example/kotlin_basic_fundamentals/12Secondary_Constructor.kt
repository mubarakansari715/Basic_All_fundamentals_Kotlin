package com.example.kotlin_basic_fundamentals

/* Secondary Constructor we use constructor as keyword. Secondary Constructor having many constructor*/

fun main() {
    val ob = Mobiles("Iphone", "13 pro")
    ob.printDisplay()
    println("Total price is : ${ob.totalPrice()}".formattingString())
}

class Mobiles constructor(brand: String, model: String, mrp: Float, discount: Float) {
    private val _brand: String = brand
    private val _model: String = model
    private val _mrp: Float = mrp
    private val _discount = discount

    constructor(_brand: String, _model: String) : this(_brand, _model, 10000f, 2000f)

    fun printDisplay() {
        println("\tMobile Details".formattingString())
        println("Name : $_brand")
        println("Model : $_model")
        println("MRP : $_mrp")
        println("Discount : $_discount")
    }

    fun totalPrice(): Float {
        return (_mrp - _discount)
    }
}
