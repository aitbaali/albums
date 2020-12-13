package com.leboncoin.android.albums.ui.albums.model

data class AlbumsPageUi(
    val albums: List<AlbumUi>
)

data class AlbumUi(
    val albumId: String,
    val id: String,
    val title: String,
    val url: String,
    val thumbnailUrl: String
)