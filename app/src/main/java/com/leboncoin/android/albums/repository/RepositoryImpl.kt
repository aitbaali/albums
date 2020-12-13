package com.leboncoin.android.albums.repository

import com.leboncoin.android.albums.domain.Repository
import com.leboncoin.android.albums.domain.model.Album
import com.leboncoin.android.albums.repository.mapper.AlbumMapper
import io.reactivex.Single

class RepositoryImpl(
    private val apiDataSource: ApiDataSource,
    private val albumMapper: AlbumMapper
) : Repository {
    override fun getAlbums(url: String): Single<List<Album>> {
        return apiDataSource.getAlbums(url)
            .map { albumsApi ->
                albumsApi.map { albumApi ->
                    albumMapper.toDomain(albumApi)
                }
            }
    }
}