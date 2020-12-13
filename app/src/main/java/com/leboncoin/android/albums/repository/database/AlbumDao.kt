package com.leboncoin.android.albums.repository.database

import androidx.room.Insert
import androidx.room.Query
import com.leboncoin.android.albums.repository.api.model.AlbumApi

interface AlbumDao {

    @Query("SELECT * FROM albums")
    fun getAlbums(): List<AlbumApi>

    @Insert
    fun insertAlbums(vararg albums: AlbumApi)
}