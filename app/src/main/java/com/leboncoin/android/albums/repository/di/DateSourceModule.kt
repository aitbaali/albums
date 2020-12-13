package com.leboncoin.android.albums.repository.di

import com.leboncoin.android.albums.domain.Repository
import com.leboncoin.android.albums.repository.ApiDataSource
import com.leboncoin.android.albums.repository.RepositoryImpl
import com.leboncoin.android.albums.repository.api.ApiDataSourceImpl
import com.leboncoin.android.albums.repository.api.retrofit.ApiRetrofitFactory
import com.leboncoin.android.albums.repository.mapper.AlbumMapper
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val apiRetrofitModule = module {
    single {
        ApiRetrofitFactory(androidContext()).buildApiService(
            ApiRetrofitFactory(androidContext()).buildApiRetrofit()
        )
    }
}

val apiDataSourceModule = module {
    single {
        ApiDataSourceImpl(
            apiService = get()
        ) as ApiDataSource
    }
}

val apiMapperModule = module {
//    single {
//        OnClickMapper()
//    }
//    single {
//        AlbumMapper(onClickMapper = get())
//    }

    single {
        AlbumMapper()
    }
}

val repositoryModule = module {
    single {
        RepositoryImpl(
            apiDataSource = get(),
            albumMapper = get()
        ) as Repository
    }
}

val koinDataSourceModules = listOf(
    apiRetrofitModule,
    apiDataSourceModule,
    apiMapperModule,
    repositoryModule
)