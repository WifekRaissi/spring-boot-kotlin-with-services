package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User

interface UserService {


    fun HelloUser(name: String):User
}