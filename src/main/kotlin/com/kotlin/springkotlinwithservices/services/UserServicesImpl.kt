package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User
import mu.KotlinLogging
import org.apache.log4j.spi.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger
import kotlin.properties.Delegates


@Service
class UserServiceImpl: UserService {

    private val log = KotlinLogging.logger {}



    override fun helloUser(name: String)=
            log.info(" hello : $name")


    override fun addUser(user: User)=
            log.info("added!!!")

    override fun updateUser(name: String, user: User)=
            log.info("$name,updated!!!")

    override fun deleteUser(name: String)=
            log.info("$name,deleted!!!")

}

