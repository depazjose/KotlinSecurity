package com.mdt.hexagonal.domain.model

class AuthenticationDto(
    val id: Long?,
    val userName: String?,
    val email: String?) {

  data class Builder(
      var id: Long? = null,
      var userName: String? = null,
      var email: String? = null
  ) {
    fun id(id: Long?) = apply { this.id = id }
    fun userName(userName: String?) = apply {this.userName = userName}
    fun email(email: String?) = apply {this.email = email}
    fun build() = AuthenticationDto(id, userName!!, email!!)
  }
}