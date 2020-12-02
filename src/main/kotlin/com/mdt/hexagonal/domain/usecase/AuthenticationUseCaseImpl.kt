package com.mdt.hexagonal.domain.usecase

import com.mdt.hexagonal.domain.model.AuthenticationDto
import com.mdt.hexagonal.domain.model.gateway.AuthenticationRepository

class AuthenticationUseCaseImpl(private val authenticationRepository: AuthenticationRepository): AuthenticationUseCase {
  override fun findByUserName(userName: String): AuthenticationDto? {
    return authenticationRepository.findByUserName(userName)
  }

}