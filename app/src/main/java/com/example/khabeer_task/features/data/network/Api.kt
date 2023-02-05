package com.raminabbasiiii.movies.data.network

import com.example.khabeer_task.features.data.responeses.employee.DataEmployee_Response
import com.example.khabeer_task.features.data.responeses.football.FootballResponse
import com.raminabbasiiii.movies.data.responeses.Login_Request_Response
import com.raminabbasiiii.movies.data.responeses.User_Response
import retrofit2.http.*

interface Api {

    @POST("LogIn")
    suspend fun Login(@Body loginRequestResponse: Login_Request_Response): User_Response

    @GET("GetPayroll")
    suspend fun get_Employee_Data(@Header("Authorization")  token :String): DataEmployee_Response

    @GET("2021/matches")
    suspend fun get_matches(@Header("X-Auth-Token")  token :String,@Query("dateFrom") dataForm : String,@Query("dateTo") dataTo : String, @Query("limit") limit : Int): FootballResponse



}