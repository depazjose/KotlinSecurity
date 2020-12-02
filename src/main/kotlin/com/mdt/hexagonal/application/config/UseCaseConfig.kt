package com.mdt.hexagonal.application.config

import com.mdt.hexagonal.domain.model.gateway.AuthenticationRepository
import com.mdt.hexagonal.domain.model.gateway.BookRepository
import com.mdt.hexagonal.domain.usecase.AuthenticationUseCaseImpl
import com.mdt.hexagonal.domain.usecase.BookUseCaseImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class UseCaseConfig {
  @Bean
  fun bookUseCaseImpl(bookRepository: BookRepository?): BookUseCaseImpl? {
    return BookUseCaseImpl(bookRepository!!)
  }

  @Bean
  fun authenticationUseCaseImpl(authenticationRepository: AuthenticationRepository): AuthenticationUseCaseImpl {
    return AuthenticationUseCaseImpl(authenticationRepository)
  }
}