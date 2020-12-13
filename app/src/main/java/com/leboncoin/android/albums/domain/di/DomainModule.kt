package com.leboncoin.android.albums.domain.di

import com.leboncoin.android.albums.domain.usecase.GetAlbumUseCase
import org.koin.dsl.module

val domainUseCaseModule = module {
    factory {
        GetAlbumUseCase(
            repository = get()
        )
    }
}

val koinDomainModules = listOf(
    domainUseCaseModule
)