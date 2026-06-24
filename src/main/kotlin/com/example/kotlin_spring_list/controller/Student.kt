package com.example.kotlin_spring_list.controller

import org.springframework.stereotype.Component

@Component
class Student (
    var id : Long,
    var name : String,
    var gender : String,
    var email : String,
){
    init {
        "New Student Created"
    }

    constructor() : this(0, "", "", "")
}