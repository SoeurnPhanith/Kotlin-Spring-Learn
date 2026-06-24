package com.example.kotlin_spring_list.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class StudentService {

    var studentList = ArrayList<Student>(
        listOf<Student>(
            Student(1, "Phanith", "Male", "phanith55@gmail.com"),
            Student(2, "Tin", "Male", "tin168@gmail.com"),
            Student(3, "Hak Kid", "Male", "hakkid33@gmail.com")
        )
    )

    fun getAllStudent(): ResponseEntity<ArrayList<Student>> {
        if(studentList.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
        }

        return ResponseEntity.ok(studentList)
    }

    fun getStudentById(id : Long): ResponseEntity<Student> {

        var student = studentList.find {
            it.id.equals(id)
        }

        if(student == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
        }
        return ResponseEntity.ok(student)

    }

    fun addStudent(student : Student): ResponseEntity<String> {

        //check exists student
        var exists = studentList.any {
                s -> s.id == student.id
        }
        if(exists) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build()
        }

        studentList.add(student)

        return ResponseEntity.status(HttpStatus.CREATED).body("new student created")

    }

    fun updateStudent(id : Long, student
    : Student): ResponseEntity<String> {

        var findS = studentList.find { s -> s.id == id }
        if(findS == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }

        //update
        findS.id = student.id
        findS.name = student.name
        findS.gender = student.gender
        findS.email = student.email

        return ResponseEntity.ok("new student updated")
    }

    fun deleteStudent(id : Long): ResponseEntity<String> {
        var findS = studentList.find { s -> s.id == id }
        if(findS == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
        studentList.remove(findS)
        return ResponseEntity.ok("this student deleted")
    }

}