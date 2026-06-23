package list

import kotlin.collections.List

//List == Immutable List (static list)

class List {}

fun main(){

    val fruit = listOf("Apple", "Banana", "Pear", "Grape", "Orange", "Pineapple")
    var hero : List<Double> ?=null
    var data : ArrayList<String> ?=null

    ///show data from list
    println(fruit)

    //or access from index
    println("Fav fruit : ${fruit[1]}")
    println("Free fruit : ${fruit[3]}")

    //access from index too using method get(index)
    println("My Fruit: ${fruit.get(4)}")
    println("Fruit : ${fruit.get(0)}")

    //using iterator(foreach)
    for(f in fruit){
        println("--- ${f}")
    }

    //using foreach
    fruit.forEach {
        println(it)
    }

    //check total or count of list
    println("Total counter : ${fruit.size} ")

    //check exists for find data
    println("Apple" in fruit)
    println(fruit.contains("Banana"))


}