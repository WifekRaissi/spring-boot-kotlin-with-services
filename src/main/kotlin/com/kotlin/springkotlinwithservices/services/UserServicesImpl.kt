package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User
import mu.KotlinLogging
import org.apache.log4j.spi.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger



@Service
class UserServiceImpl: UserService {
        val counter = AtomicLong()
    private val logger = KotlinLogging.logger {}


    override fun helloUser(name: String): User {

        return User(counter.incrementAndGet(), "hello,$name", "", birthDay = Date())


    }


    override fun addUser(user: User): User {
        return User(counter.incrementAndGet(), user.name, user.surname, user.birthDay)
        logger.info { "added $user.name" }

    }

    override fun updateUser(surname: String, user: User): User {

        return User(counter.incrementAndGet(), user.name, surname, user.birthDay)
        logger.info { "updated $surname" }


    }

    override fun deleteUser(name: String, user: User): String {
        if (user.name == name) {


            logger.info { "hello $name" }
        }
        return ("Not found")
    }

}

