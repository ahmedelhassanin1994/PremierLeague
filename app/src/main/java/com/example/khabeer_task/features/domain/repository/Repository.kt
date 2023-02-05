package com.raminabbasiiii.movies.domain.repository

import arrow.core.Either
import com.example.khabeer_task.features.domain.entities.Football_Entities
import com.example.room.data.network.Failure

interface Repository {



    suspend  fun get_matches(token :String,dateForm :String,dateTo: String,limit :Int): Either<Failure, Football_Entities>


}