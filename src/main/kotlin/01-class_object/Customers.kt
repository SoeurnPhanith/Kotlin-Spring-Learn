package org.example.class_object

//No   : 01
class Customers {

    //field in kotlin are requried to init value
    var name:String = ""
    var age:Int = 0

    //if use lateinit you can assign value in next time
    lateinit var address:String

}