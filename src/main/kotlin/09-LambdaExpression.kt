package org.example

fun main(){

    print(sum(1,1))
    annonymous("anonymou")

}

///Lambda expression គឺជា function សរសេរខ្លីៗ (anonymous function)
// ដែលមិនចាំបាច់មានឈ្មោះ (name) ហើយអាច assign ទៅ variable
// ឬ pass ទៅ function ផ្សេងបាន

var sum = { x: Int, y: Int -> x + y }
var annonymous = {message: String -> println(message)}