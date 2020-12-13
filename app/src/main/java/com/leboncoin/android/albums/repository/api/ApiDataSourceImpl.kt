package com.leboncoin.android.albums.repository.api

import com.leboncoin.android.albums.repository.ApiDataSource
import com.leboncoin.android.albums.repository.api.model.AlbumApi
import com.leboncoin.android.albums.repository.api.retrofit.ApiService
import io.reactivex.Single

class ApiDataSourceImpl(
    private val apiService: ApiService
) : ApiDataSource {

    override fun getAlbums(url: String): Single<List<AlbumApi>> {
        return apiService.getAlbums(url)
    }
}