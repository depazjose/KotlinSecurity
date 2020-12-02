package com.mdt.hexagonal.infrastructure.adapter.database.authentication

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.RepositoryDefinition

@RepositoryDefinition(domainClass = AuthenticationData::class, idClass = Long::class)
interface AuthenticationDataRepository: JpaSpecificationExecutor<AuthenticationData> {

  fun findByUserName(username: String): AuthenticationData?
}