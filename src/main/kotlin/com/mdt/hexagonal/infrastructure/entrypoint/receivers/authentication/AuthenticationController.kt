package com.mdt.hexagonal.infrastructure.entrypoint.receivers.authentication

import com.mdt.hexagonal.domain.usecase.AuthenticationUseCase
import com.mdt.hexagonal.infrastructure.entrypoint.receivers.authentication.dto.AuthenticationResponse
import org.apache.logging.log4j.LogManager
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping(value = ["/api/v1/authentication"], produces = [MediaType.APPLICATION_JSON_VALUE])
class AuthenticationController(private val authenticationUseCase: AuthenticationUseCase) {
  private val logger = LogManager.getLogger(AuthenticationController::class)

  @RequestMapping(value = ["/{userName}"], method = [RequestMethod.GET])
  fun getAuthenticationByUserName(@PathVariable userName : String): AuthenticationResponse.AuthenticationDetailResponse {
    logger.info("getAuthenticationByUserName")
    return AuthenticationResponse.fromModel(authenticationUseCase.findByUserName(userName)?:
    throw ResponseStatusException(HttpStatus.NOT_FOUND, "Username does not exists!"))
  }
}