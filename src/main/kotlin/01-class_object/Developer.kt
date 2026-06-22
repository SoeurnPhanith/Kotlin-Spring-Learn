package org.example.class_object

//No  : 02
class Developer {

    //field
    lateinit var name : String
    lateinit var position : String
    lateinit var team : String
    var salary: Double? = null
    //lateinit can use only String

    //functionally
    fun addDeveloper(){
        print("Name : ")
        name = readLine()!!

        print("Position : " )
        position = readLine()!!

        print("Team : " )
        team = readLine()!!

        print("Salary : " )
        salary = readLine()!!.toDouble()
    }

    //using toString() function to display object
    override fun toString(): String {
        return "\n ================ Developer Info ====================\n" +
                "Name       : ${name}\n" +
                "Position   : ${position}\n" +
                "Team       : ${team}\n" +
                "Salary     : ${salary}$";
    }

}

//main
fun main(args: Array<String>){

    //using multiple object
    val developer = Developer()
    val dev = Developer()
    val d = Developer()

    developer.addDeveloper()
    dev.addDeveloper()

    print(dev)
    print(developer)
    print(d)

}