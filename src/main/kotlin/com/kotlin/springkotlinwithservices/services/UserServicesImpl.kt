package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User
import mu.KotlinLogging
import org.springframework.stereotype.Service
import java.util.*


@Service
class UserServiceImpl: UserService {

    private val log = KotlinLogging.logger {}


    override fun getUser(name: String)=
      User(1, name, "wifek", Date("2000-02-23"))

    override fun addUser(user: User)=
            log.info("${user.name},added!!!")

    override fun updateUser(name: String, user: User)=
            log.info("$name,updated!!!")

    override fun deleteUser(name: String)=
            log.info("$name,deleted!!!")

}

