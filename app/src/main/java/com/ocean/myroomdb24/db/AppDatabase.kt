package com.ocean.myroomdb24.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ocean.myroomdb24.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}