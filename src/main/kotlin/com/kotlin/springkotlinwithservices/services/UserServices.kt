package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User

interface UserService {


    fun helloUser(name: String): User
    fun addUser(user: User): User
    fun updateUser(name: String, user: User): User
    fun deleteUser(name: String, user: User): String
}