package org.example

fun main(){

    var number = arrayOf(1,2,3,4,5)
    var fruits = arrayOf("Apple", "Pear", "Grape")

    number.forEach { println(it) }
    println(fruits.contentToString())

    //foreach
    for (fruit in fruits){
        println(fruit)
    }

}