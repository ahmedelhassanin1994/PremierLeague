package com.example.khabeer_task.features.data.data_source.remote

import com.example.khabeer_task.features.data.responeses.employee.DataEmployee_Response
import com.example.khabeer_task.features.data.responeses.football.FootballResponse
import com.raminabbasiiii.movies.data.responeses.Login_Request_Response
import com.raminabbasiiii.movies.data.responeses.User_Response

interface RemoteDataSource {

    suspend fun Login(loginRequestResponse: Login_Request_Response): User_Response
    suspend fun get_Employee_Data(token :String): DataEmployee_Response
    suspend fun get_matches(token :String,dateFrom :String,dateTo : String,limit :Int): FootballResponse


}
