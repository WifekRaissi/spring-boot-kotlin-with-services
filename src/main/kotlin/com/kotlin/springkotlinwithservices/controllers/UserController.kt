package com.kotlin.springkotlinwithservices.controllers

import com.kotlin.springkotlinwithservices.entities.User
import com.kotlin.springkotlinwithservices.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController(){

    @Autowired
    lateinit var userService: UserService


    @GetMapping("/hello")
    fun helloUser(@RequestParam(value = "name") name: String)=
        userService.HelloUser("$name")
    }


