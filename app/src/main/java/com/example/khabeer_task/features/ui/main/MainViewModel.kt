package com.example.khabeer_task.features.ui.main

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.khabeer_task.util.BaseApplication
import com.raminabbasiiii.movies.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.example.khabeer_task.features.domain.entities.Football_Entities
import com.example.room.domain.usecase.Football_UseCase
import com.example.room.domain.usecase.InputData_Football
import com.raminabbasiiii.movies.util.Constants


@ExperimentalCoroutinesApi
@HiltViewModel
class MainViewModel
@Inject
constructor(private val footballUsecase: Football_UseCase) : ViewModel() {
    // TODO: Implement the ViewModel


    private val _UserEntities : MutableLiveData<Resource<Football_Entities>> = MutableLiveData()
    val movieDetails : LiveData<Resource<Football_Entities>> = _UserEntities
    private val TAG :String="MainViewModel"

    var phone = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    var context: Context? = BaseApplication.applicationContext()



    fun get_data()   {
        viewModelScope.launch {

            footballUsecase.execute(InputData_Football(Constants.Token,"2023-02-03","2023-02-05",10)).fold(
                {
                    Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "get_data:   ${it.message}")

                },
                {

                    Resource.success(it)
                    _UserEntities.postValue(Resource.success(it))

                }
            )
        }
    }

}