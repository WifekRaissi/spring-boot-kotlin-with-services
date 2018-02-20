package com.kotlin.springkotlinwithservices.controllers

import com.kotlin.springkotlinwithservices.entities.User
import com.kotlin.springkotlinwithservices.services.UserService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController() {

    @Autowired
    lateinit var userService: UserService


    @GetMapping("/users")
    fun helloUser(@RequestParam(value = "name") name: String) {
        userService.helloUser(name)
    }

    @PostMapping("/users")
    fun addUser(@RequestBody user: User) {
        userService.addUser(user)
    }

    @PutMapping("/users")
    fun updateUser(@RequestParam(value = "name") name: String, @RequestBody user: User) {
        userService.updateUser(name, user)
    }

    @DeleteMapping("/users")
    fun deleteUser(@RequestParam(value = "name") name: String) {
        userService.deleteUser(name)
    }
}





