package com.njagi.restapi2.models

import nonapi.io.github.classgraph.json.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
    @Id var id: String,
    var name: String,
    var email: String,
    var password: String
)
