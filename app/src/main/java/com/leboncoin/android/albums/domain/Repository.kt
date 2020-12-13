package com.leboncoin.android.albums.domain

import com.leboncoin.android.albums.domain.model.Album
import io.reactivex.Single

interface Repository {
    fun getAlbums(url: String): Single<List<Album>>
}