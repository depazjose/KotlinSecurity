package com.mdt.hexagonal.infrastructure.adapter.database.authentication

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "authentication_user")
data class AuthenticationData(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @NotBlank(message = "User Name is mandatory")
    @Column(name = "user_name")
    val userName: String,

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    val email: String,

    @NotBlank(message = "Password is mandatory")
    @Column(name = "password")
    val password: String
)