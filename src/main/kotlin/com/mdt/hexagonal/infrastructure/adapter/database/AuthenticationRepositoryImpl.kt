package com.mdt.hexagonal.infrastructure.adapter.database

import com.mdt.hexagonal.domain.model.AuthenticationDto
import com.mdt.hexagonal.domain.model.gateway.AuthenticationRepository
import com.mdt.hexagonal.infrastructure.adapter.database.authentication.AuthenticationRepositoryAdapter
import org.springframework.stereotype.Component

@Component
class AuthenticationRepositoryImpl(private val authenticationRepositoryAdapter: AuthenticationRepositoryAdapter) :
    AuthenticationRepository {

  override fun findByUserName(userName: String): AuthenticationDto? {
    return authenticationRepositoryAdapter.findByUserName(userName)
  }

}