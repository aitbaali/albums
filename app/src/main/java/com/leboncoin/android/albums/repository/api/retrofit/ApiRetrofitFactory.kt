package com.leboncoin.android.albums.repository.api.retrofit

import android.content.Context
import com.leboncoin.android.albums.repository.network.RetrofitFactory.buildHttpClient
import com.leboncoin.android.albums.repository.network.RetrofitFactory.buildMoshi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiRetrofitFactory(private val context: Context) {

    fun buildApiRetrofit(): Retrofit {
        return Retrofit.Builder()
            .client(buildHttpClient())
            .baseUrl("https://static.leboncoin.fr/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create(buildMoshi()))
            .build()
    }

    fun buildApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}