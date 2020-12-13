package com.leboncoin.android.albums.repository.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leboncoin.android.albums.repository.api.model.AlbumApi

@Database(entities = [AlbumApi::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun albumDao(): AlbumDao
}