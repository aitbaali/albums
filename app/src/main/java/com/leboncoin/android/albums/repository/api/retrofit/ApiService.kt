package com.leboncoin.android.albums.repository.api.retrofit

import com.leboncoin.android.albums.repository.api.model.AlbumApi
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    fun getAlbums(
        @Url urlPage: String
    ): Single<List<AlbumApi>>
}