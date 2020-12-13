package com.leboncoin.android.albums.domain.usecase

import com.leboncoin.android.albums.domain.Repository
import com.leboncoin.android.albums.domain.model.Album
import io.reactivex.Single

class GetAlbumUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Single<List<Album>> {
        return repository.getAlbums(URL)
    }

    companion object {
        private const val URL = "https://static.leboncoin.fr/img/shared/technical-test.json"
    }
}