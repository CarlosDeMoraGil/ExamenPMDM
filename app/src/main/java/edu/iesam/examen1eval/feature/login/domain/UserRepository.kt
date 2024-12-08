package edu.iesam.examen1eval.feature.login.domain

interface UserRepository {

    fun addUser(user: User)

    fun findById(username: String?): User?

}