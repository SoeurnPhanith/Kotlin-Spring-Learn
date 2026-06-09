package org.example

fun main(){

    //1. Arithmetic Operator
    var x = 10
    var y = 3

    println(x + y) // 13
    println(x - y) // 7
    println(x * y) // 30
    println(x / y) // 3
    println(x % y) // 1


    //2.Assignment Operator
    var i = 10

    i += 5   // 15
    i -= 2   // 13
    i *= 2   // 26
    i /= 2   // 13
    i %= 3   // 1


    //3. increment/Decrement Operator
    var k = 5

    k++  // 6
    k--  // 5


    //4.Comparision Operator
    var a = 10
    var b = 20

    println(a == b) // false
    println(a != b) // true
    println(a > b)  // false
    println(a < b)  // true
    println(a >= b) // false
    println(a <= b) // true


    //5. Logical Operator
    var age = 20

    println(age > 18 && age < 30)
    println(age > 50 || age < 25)
    println(!(age < 18))


    //6.membership operator
    var number = 5

    println(number in 1..10)
    println(number !in 20..30)

}