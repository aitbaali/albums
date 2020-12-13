package com.leboncoin.android.albums.ui.albums

import com.leboncoin.android.albums.domain.usecase.GetAlbumUseCase
import com.leboncoin.android.albums.ui.albums.mapper.AlbumsUiMapper
import com.leboncoin.android.albums.ui.albums.model.AlbumsPageUi
import com.leboncoin.android.albums.ui.common.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class AlbumsViewModel(
    getAlbumsUseCase: GetAlbumUseCase,
    albumsUiMapper: AlbumsUiMapper
) : BaseViewModel<AlbumsPageUi>() {

    init {
        getAlbumsUseCase()
            .subscribeOn(Schedulers.io())
            .map { albums ->
                albumsUiMapper.toUi(albums)
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = { albumsPageUi ->
                    postUiData(albumsPageUi)
                },
                onError = {}
            )
    }
}