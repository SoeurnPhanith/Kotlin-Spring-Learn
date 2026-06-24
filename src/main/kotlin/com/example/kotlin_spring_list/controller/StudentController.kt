package com.example.kotlin_spring_list.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController(studentService: StudentService) {

    var service: StudentService = studentService


    @GetMapping
    fun getAllStudent(): ResponseEntity<ArrayList<Student>> {
       return service.getAllStudent()
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id : Long): ResponseEntity<Student> {
        return service.getStudentById(id)
    }

    @PostMapping
    fun addStudent(@RequestBody student : Student): ResponseEntity<String> {
        return service.addStudent(student = student)
    }

    @PutMapping("/{id}")
    fun updateStudent(@PathVariable id : Long, @RequestBody student
    : Student): ResponseEntity<String> {
        return service.updateStudent(id, student = student)
    }

    @DeleteMapping("/{id}")
    fun deleteStudent(@PathVariable id : Long): ResponseEntity<String> {
        return service.deleteStudent(id)
    }
}