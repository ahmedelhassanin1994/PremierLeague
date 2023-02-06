package com.example.khabeer_task.features.data.data_source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.khabeer_task.features.domain.entities.Football_Entities
import kotlinx.coroutines.flow.Flow

@Dao
interface MatchesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(postList: Football_Entities)

    @Query("SELECT * FROM Football_Entities ORDER BY id ASC")
    fun getAll():Flow<Football_Entities>

}