package com.kotlin.springkotlinwithservices.services

import com.kotlin.springkotlinwithservices.entities.User
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.atomic.AtomicLong


@Service
class UserServiceImpl: UserService {
    val counter = AtomicLong()


    override fun HelloUser(name: String): User {

        return User(counter.incrementAndGet(), "hello,$name", "", birthDate = Date())
    }


    override fun addUser(user: User): User {
        return User(counter.incrementAndGet(), user.name, user.surname, user.birthDate)


    }

    override fun updateUser(surname: String, user: User): User {

        return User(counter.incrementAndGet(), user.name, surname, user.birthDate)


    }

    override fun deleteUser(name: String, user: User): String {
        if (user.name == name) {


            return ("$name,deleted")
        }
        return ("Not found")
    }

}

