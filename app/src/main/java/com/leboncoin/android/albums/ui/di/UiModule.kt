package com.leboncoin.android.albums.ui.di

import com.leboncoin.android.albums.ui.albums.AlbumsViewModel
import com.leboncoin.android.albums.ui.albums.mapper.AlbumsUiMapper
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiAlbumsViewModelModule = module {
    single {
        AlbumsUiMapper()
    }
    viewModel {
        AlbumsViewModel(
            getAlbumsUseCase = get(),
            albumsUiMapper = get()
        )
    }
}

val koinUiModules = listOf(
    uiAlbumsViewModelModule
)