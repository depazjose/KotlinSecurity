package com.mdt.hexagonal.infrastructure.entrypoint.receivers.authentication.dto

import com.mdt.hexagonal.domain.model.AuthenticationDto
import java.util.stream.Collectors

interface AuthenticationResponse {
  class AuthenticationDetailResponse private constructor(
      val id: Long?,
      val userName: String?,
      val email: String?
  ) {
    data class Builder(
        var id: Long? = null,
        var userName: String? = null,
        var email: String? = null) {

      fun id(id: Long?) = apply { this.id = id }
      fun userName(userName: String?) = apply { this.userName = userName}
      fun email(email: String?) = apply { this.email = email}
      fun build() = AuthenticationDetailResponse(id, userName, email)
    }
  }

  companion object {
    fun fromModel(authentication: AuthenticationDto): AuthenticationDetailResponse {
      return AuthenticationDetailResponse.Builder()
          .id(authentication.id)
          .userName(authentication.userName)
          .email(authentication.email)
          .build()
    }

    fun fromModel(authentications: List<AuthenticationDto>): List<AuthenticationDetailResponse> {
       return authentications.stream()
           .map {authentication : AuthenticationDto -> fromModel(authentication) }.collect(Collectors.toList())
       }
  }
}