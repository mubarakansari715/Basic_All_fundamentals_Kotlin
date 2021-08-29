package com.example.kotlin_basic_fundamentals

/*
Regular Expression(Regex)
A regular expression is a sequence of characters which used is to define a pattern. This pattern is also known as a regex.
==> The matches() method returns true if the regular expression matches the entire input string.
==> The containsMatchIn() method indicates whether the regular expression can find at least one match in the specified input.
 */

fun main() {
    val pass = "[a-zA-Z0-9]+"
    val regex = Regex(pass)

    println(regex.containsMatchIn("mubarak_ansari"))    //at least one match(at least one alphabet a to z)
    println(regex.matches("mubarakansari"))            //input only string not any kind of special character.
    println(regex.containsMatchIn("$/+"))
    println(regex.matches("_mubarakansari"))

}