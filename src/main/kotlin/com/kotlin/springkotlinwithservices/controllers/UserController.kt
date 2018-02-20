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
    private val log = KotlinLogging.logger {}

    @GetMapping("/hello")
    fun helloUser(@RequestParam(value = "name") name: String) {
        log.info(" hello : $name")
        userService.helloUser("$name")
    }

    @PostMapping("/add")
    fun addUser(@RequestBody user: User) {
        log.info(" added : ${user.name}")
        userService.addUser(user)
    }

    @PutMapping("/update")
    fun updateUser(@RequestParam(value = "surname") surname: String, @RequestBody user: User) {
        log.info(" updated : $surname")
        userService.updateUser(surname, user)
    }

    @DeleteMapping("/delete")
    fun deleteUser(@RequestParam(value = "name") name: String, @RequestBody user: User) {
        log.info(" updated : $name")
        userService.deleteUser(name, user)
    }
}





