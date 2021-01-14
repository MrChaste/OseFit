package com.osecraft.osefit.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.osecraft.osefit.util.Converters

@Database(entities = [Run::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RunDatabase : RoomDatabase() {
    abstract fun getRunDao(): RunDao
    companion object {
        const val DATABASE_NAME = "run.db"
    }
}