package com.example.khabeer_task.features.data.data_source.local
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.khabeer_task.features.domain.entities.Football_Entities


@Database(entities = [Football_Entities::class], version = 1,exportSchema = false)

abstract class MatchesDatabase : RoomDatabase() {
    abstract  fun getMatchesDao():MatchesDao
}