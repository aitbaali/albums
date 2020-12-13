package com.leboncoin.android.albums.repository.database

import android.content.Context
import androidx.room.Room

class RoomFactory(private val context: Context) {
    fun buildDatabase(): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "albums-app-db"
        ).build()
    }
}