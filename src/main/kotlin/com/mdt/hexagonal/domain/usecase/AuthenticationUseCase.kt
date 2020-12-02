package com.mdt.hexagonal.domain.usecase

import com.mdt.hexagonal.domain.model.AuthenticationDto

interface AuthenticationUseCase {
  fun findByUserName(userName: String): AuthenticationDto?
}