package com.leboncoin.android.albums.ui.albums.mapper

import com.leboncoin.android.albums.domain.model.Album
import com.leboncoin.android.albums.ui.albums.model.AlbumUi
import com.leboncoin.android.albums.ui.albums.model.AlbumsPageUi
import com.leboncoin.android.albums.ui.common.BaseUiMapper

class AlbumsUiMapper : BaseUiMapper<List<Album>, AlbumsPageUi>() {
    override fun toUi(domain: List<Album>): AlbumsPageUi {
        val albumsUi = domain.map { album ->

            AlbumUi(
                albumId = album.albumId,
                id = album.id,
                title = album.title,
                url = album.url,
                thumbnailUrl = album.thumbnailUrl
            )
        }

        return AlbumsPageUi(
            albums = albumsUi
        )
    }
}