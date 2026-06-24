package com.example.kotlin_spring_list.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test" )
class TestController {

    @GetMapping
    fun greet(): String = "Hello World"

    @GetMapping(value = ["/info"])
    fun showInfo(
        @RequestParam name: String,
        @RequestParam gender: String,
        @RequestParam address: String
    ): String {
        return "Name    :  $name\n" +
               "Gender  :  $gender\n" +
               "Address :  $address"
    }

    @GetMapping("/{id}")
    fun getId(@PathVariable id : Long): String{
        return "Id : $id"
    }

    @GetMapping("/user/{id}")
    fun showUserId(@PathVariable     id : Long) : String{
        return "User id : ${id}"
    }
}