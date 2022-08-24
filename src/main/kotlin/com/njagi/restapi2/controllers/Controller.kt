package com.njagi.restapi2.controllers

import com.njagi.restapi2.models.User
import com.njagi.restapi2.repositories.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class Controller(private val repo : UserRepository) {

    @GetMapping("/")
    fun getUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(this.repo.findAll())
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: String): ResponseEntity<User>{
      return ResponseEntity.ok(this.repo.findById(id).orElse(null))
    }

    @PostMapping
    fun addUser(@RequestBody user: User): ResponseEntity<User>{
        return ResponseEntity.ok(this.repo.save(user))
    }

    @PutMapping
    fun editUser(@PathVariable id: String, @RequestBody user: User){

    }

}