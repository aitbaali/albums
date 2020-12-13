package com.leboncoin.android.albums.repository.mapper

import com.leboncoin.android.albums.domain.model.Album
import com.leboncoin.android.albums.repository.api.model.AlbumApi

class AlbumMapper : BaseDomainMapper<AlbumApi, Album>() {

    override fun toDomain(api: AlbumApi): Album {
        return Album(
            albumId = api.albumId,
            id = api.id,
            title = api.title,
            url = api.url,
            thumbnailUrl = api.thumbnailUrl
        )
    }
}