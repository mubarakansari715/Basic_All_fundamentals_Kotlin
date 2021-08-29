package com.example.kotlin_basic_fundamentals

/*getter setter method is provide to the get and set value*/

fun main() {
    val ob = Persons("Mubarak", 20)
    println(ob.names)
    ob.ages = 22
}

class Persons(parsename: String, parseage: Int) {
    var names: String = parsename
        get() {
            return field.toUpperCase()
        }
    var ages: Int = parseage
        set(value) {
            if (value > 0) {
                field = value
                println("Age is ${ages}")

            } else
                println("Age is Nagative")

        }

}