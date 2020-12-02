package com.mdt.hexagonal.infrastructure.adapter.database.authentication

import com.mdt.hexagonal.domain.model.AuthenticationDto
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.stereotype.Repository

@Repository
class AuthenticationRepositoryAdapter(private val jpaAuthenticationRepository: AuthenticationDataRepository) {

  var logger: Logger = LogManager.getLogger(AuthenticationRepositoryAdapter::class)

  fun findByUserName(userName: String): AuthenticationDto? {
    return jpaAuthenticationRepository.findByUserName(userName)?.let {
      return AuthenticationDto.Builder()
          .id(it.id)
          .userName(it.userName)
          .email(it.email)
          .build()
    }
  }
}