package org.example.`06-abstraction`.abstract

class Dog(name: String) : Animal(name){

    override fun makeSound(): String {
        TODO("Not yet implemented")
        return "Vvos Vvos Vvos";
    }

}


fun main(){

    val dog = Dog("Bo Bo")


    dog.showName()
    print(dog.makeSound())


}