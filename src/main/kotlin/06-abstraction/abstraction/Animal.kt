package org.example.`06-abstraction`.abstract

abstract class Animal (val name: String){ //primary con

    //abstract method
    abstract fun makeSound() : String

    //normal method
    fun showName(){
        println("Animal name is $name")
    }

}