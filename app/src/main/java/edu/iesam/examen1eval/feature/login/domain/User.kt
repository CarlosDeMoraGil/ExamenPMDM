package edu.iesam.examen1eval.feature.login.domain

data class User(
    val username: String?,
    val password: String?,
    var remember: Boolean
)