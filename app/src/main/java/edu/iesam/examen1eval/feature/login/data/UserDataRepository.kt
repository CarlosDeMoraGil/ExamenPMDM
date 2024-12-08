package edu.iesam.examen1eval.feature.login.data

import edu.iesam.examen1eval.feature.login.data.local.LoginXmlLocalDataSource
import edu.iesam.examen1eval.feature.login.domain.User
import edu.iesam.examen1eval.feature.login.domain.UserRepository
import org.koin.core.annotation.Single

@Single
class UserDataRepository(private val local: LoginXmlLocalDataSource) : UserRepository {

    override fun addUser(user: User) {
        local.save(user)
    }

    override fun findById(username: String?): User? {
        return local.findById(username)
    }
}