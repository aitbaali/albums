package com.leboncoin.android.albums.repository

import com.leboncoin.android.albums.repository.api.model.AlbumApi
import io.reactivex.Single

interface ApiDataSource {
    fun getAlbums(url: String): Single<List<AlbumApi>>
}