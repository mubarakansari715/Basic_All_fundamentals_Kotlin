package com.example.kotlin_basic_fundamentals

import android.os.Build
import androidx.annotation.RequiresApi

/*
Maps are used to store key and value pairs.
user defined. In Map:
1.The key should be unique and only one value can be stored for each unique key.
2.Values can be duplicate.
3.The key and value can be of different data type.
4.The to keyword is used to map a key to a value.
5.A key value pair is also known as an entry.
6. defined value using 'to' like (key to value)
*/

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val map1 = mapOf(1 to "Ansari", 3 to "Happy", 2 to "Mubarak")
    println("Map list ${map1.toSortedMap()}")
    /// mutable map
    val map = mutableMapOf(1 to "Ansari", 3 to "Happy", 2 to "Mubarak", 5 to 5)
    println(map)
    map.put(4, "mubu")
    println(map)
    map.replace(3, "mr.happy")
    println(map)
    map.remove(5)
    println(map)
}