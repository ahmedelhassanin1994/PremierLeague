package com.example.room.domain.usecase

import arrow.core.Either
import com.example.khabeer_task.features.domain.entities.Football_Entities
import com.example.room.data.network.Failure
import com.raminabbasiiii.movies.domain.repository.Repository
import com.raminabbasiiii.movies.domain.usecase.BaseCase

class Football_UseCase(private val repository : Repository) : BaseCase<InputData_Football, Football_Entities> {

    override suspend fun execute(input: InputData_Football): Either<Failure, Football_Entities> {
       return repository.get_matches(input.token,input.dateFrom,input.dateto,input.limit)
    }
}

data class  InputData_Football(
    val token :String,
    val dateFrom :String,
    val dateto :String,
    val limit :Int,
    )