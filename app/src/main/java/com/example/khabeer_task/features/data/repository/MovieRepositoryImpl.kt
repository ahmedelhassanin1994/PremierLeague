package com.raminabbasiiii.movies.data.repository

import Network
import arrow.core.Either
import com.example.khabeer_task.features.domain.entities.Football_Entities
import com.example.khabeer_task.util.BaseApplication
import com.example.room.data.network.Failure
import com.example.khabeer_task.features.data.data_source.remote.RemoteDataSource
import com.raminabbasiiii.movies.data.mapper.toFootball
import com.raminabbasiiii.movies.data.network.ResponseMessage
import com.raminabbasiiii.movies.domain.repository.Repository
import java.lang.Exception
import javax.inject.Inject


class MovieRepositoryImpl
@Inject
constructor(
    private val remoteDataSource: RemoteDataSource,

    ): Repository {

    private val TAG="MovieRepositoryImpl";


    override suspend fun get_matches(token: String, dateForm: String, dateTo: String, limit: Int): Either<Failure, Football_Entities> {
        if (Network.checkConnectivity(BaseApplication.applicationContext())) {

            try {

                var response = remoteDataSource.get_matches(token, dateForm, dateTo, limit);
                if (response.count != null) {


                    return Either.Right(
                        remoteDataSource.get_matches(token, dateForm, dateTo, limit).toFootball()
                    )

                } else {
                    return Either.Left(Failure(-1, ResponseMessage.BAD_REQUEST))

                }

            } catch (e: Exception) {


                return Either.Left(Failure(-1, e.message.toString()))
            }

        } else {
            return Either.Left(Failure(-1, ResponseMessage.SEND_TIMEOUT))

//            try {
//
//            } catch (e: Exception) {
//
//            }

        }


    }


}
