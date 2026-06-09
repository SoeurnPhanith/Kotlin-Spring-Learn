package org.example

fun main(){

    //1. if statement
    val age = 18

    if (age >= 18) {
        println("Adult")
    }


    //2. if-else statement
    val agePart2 = 16

    if (agePart2 >= 18) {
        println("Adult")
    } else {
        println("Minor")
    }


    //3. if-elseif statement
    val score = 75

    if (score >= 90) {
        println("A")
    } else if (score >= 80) {
        println("B")
    } else if (score >= 70) {
        println("C")
    } else {
        println("Fail")
    }


    //4. When expression == switch
    val day = 4
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }
}