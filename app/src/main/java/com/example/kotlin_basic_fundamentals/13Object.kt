package com.example.kotlin_basic_fundamentals

/*where we want to have some properties common for all objects of the class.
object is Singleton pattern and ob Expression.
when we use object and companion object?
If we need to provide the Singleton behavior, then we are better off with Objects ,
else if we just want to add some static essence(abstract) to our classes, we can use Companion objects .
*/
fun main() {
    myOb.fbView()
    myOb.instaView()
    myOb.instaView()
    myOb.instaView()
    myOb.display()
    //Expression Object
    val ob = object : PersonName("Ansari") {
        override fun fname() {
            super.fname()
            println("Expression called $name")
        }
    }
    ob.fname()
    //companion object
    PersonName.displays()

}

///singleton Pattern
object myOb {
    var insta = 0
    var fb = 0
    fun instaView() = insta++
    fun fbView() = fb++
    fun display() {
        println("Instagram View : ${instaView()} \nFacebook View : ${fbView()}")
    }
}

open class PersonName(val name: String) {
    open fun fname() {
        println("Name is $name")
    }
    companion object ComOb {
        fun displays() = println("companion object called")
    }
}