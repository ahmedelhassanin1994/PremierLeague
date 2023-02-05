package com.example.khabeer_task.features.data.data_source.remote


import com.example.khabeer_task.features.data.responeses.employee.DataEmployee_Response
import com.example.khabeer_task.features.data.responeses.football.FootballResponse
import com.raminabbasiiii.movies.data.network.Api
import com.raminabbasiiii.movies.data.responeses.Login_Request_Response
import com.raminabbasiiii.movies.data.responeses.User_Response
import javax.inject.Inject

class RemoteDataSourceImplementer
@Inject
constructor(
    private val api: Api
) : RemoteDataSource {


    override suspend fun Login(loginRequestResponse: Login_Request_Response): User_Response {
        return api.Login(loginRequestResponse);
    }

    override suspend fun get_Employee_Data(token: String): DataEmployee_Response {

        return api.get_Employee_Data(token)
    }

    override suspend fun get_matches(token: String, dateFrom: String, dateTo: String, limit: Int): FootballResponse {
        return  api.get_matches(token,dateFrom,dateTo,limit);
    }


}
