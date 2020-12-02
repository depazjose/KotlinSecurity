package com.mdt.hexagonal.domain.model.gateway

import com.mdt.hexagonal.domain.model.AuthenticationDto

interface AuthenticationRepository {
  fun findByUserName(userName: String): AuthenticationDto?
}