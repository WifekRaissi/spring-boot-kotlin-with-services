package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.atomic.AtomicLong


@Service
class UserServiceImpl: UserService {
    val counter = AtomicLong()



  /*  override fun HelloUser(name: String): String {
       return ("Hello, $name")
    }
*/

    override fun HelloUser(name: String):User {
        return User(counter.incrementAndGet(),"name:$name",surname = "",birthDate = Date())


    }




}

