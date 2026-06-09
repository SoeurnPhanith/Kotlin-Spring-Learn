package org.example

///User input is use for input data from keyboard or user
///and using readln() for input
fun main(){

    val staffName : String
    var generations : Int =0
    val position : String

    println("=============ACLEDA new recruitment training============")
    print("Staff name   : ")
    staffName = readln()
    print("Position   : ")
    position = readln()
    print("Generation   : ")
    generations = readln().toInt()

    println("===============Show information=============")
    println(
        "Staff name    : ${staffName}\n" +
        "Position   : ${position}\n" +
        "Generation   : ${generations}\n"
    )


}