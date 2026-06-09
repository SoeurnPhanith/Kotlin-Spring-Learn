package org.example

fun main(){

    println("\n=========== For loop")
    //1. for loop
    for(i in 1..10){
        print("$i \t")
    }
    //i want to get 2 step (increment)
    println()
    for(i in 2..16 step 2){
        print("$i \t")
    }
    //i want to get 2 step (decrement)
    println()
    for(i in 9 downTo 5 step 2){
        print("$i \t")
    }


    println("\n=========While loop")
    //2. While loop
    var i = 1

    while (i <= 5) {
        println(i)
        i++
    }
    //login style
    var password = "1234"
    var input = "1234"

    while (input != password) {
        println("Wrong password")
        input = "1234"
    }

    println("Login success")

    println("\n=================Do While loop")
    var j : Int = 1
    do {
        print("${j} \t")
        j++
    }while (j <= 5)

}