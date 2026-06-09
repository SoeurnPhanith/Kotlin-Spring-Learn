package org.example

fun main(){

    //1. break
    for(i in 2..19 step 3){
        println("Normal printing $i")
        if(i == 11) break
    }

    //2.continue
    for (i in 1..5) {
        if (i == 3) continue
        println(i)
    }


    var login = 0
    var password = ""

    while (true) {
        print("Input your password: ")
        password = readln()

        if (password == "1234abc") {
            println("Correct password")
            break
        } else {
            login++
            println("Wrong password!")

            if (login >= 3) {
                println("Please wait to login tomorrow")
                break
            }
        }
    }
}




