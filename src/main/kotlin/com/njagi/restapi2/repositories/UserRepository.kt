package com.njagi.restapi2.repositories

import com.njagi.restapi2.models.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String > {

}