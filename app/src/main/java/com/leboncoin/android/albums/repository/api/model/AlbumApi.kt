package com.leboncoin.android.albums.repository.api.model

import androidx.room.PrimaryKey

data class AlbumApi(
    @PrimaryKey val id: String,
    val albumId: String,
    val title: String,
    val url: String,
    val thumbnailUrl: String
)