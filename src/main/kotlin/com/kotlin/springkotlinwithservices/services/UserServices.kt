package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User

interface UserService {


    //fun HelloUser(name: String):User
    fun addUser(user: User): User
    fun updateUser(name: String, user: User): User
   // fun HelloUser(user: User): User
   // fun HelloUser(name: String, user: User): User

    //fun HelloUser(user: User): String
    fun HelloUser(name: String): User

    fun deleteUser(name: String, user: User): String
}