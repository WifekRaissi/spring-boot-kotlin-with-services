package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User

interface UserService {


    fun helloUser(name: String)
    fun addUser(user: User)
    fun updateUser(name: String, user: User)
    fun deleteUser(name: String)
}