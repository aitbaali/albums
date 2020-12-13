package com.leboncoin.android.albums.repository.mapper

abstract class BaseDomainMapper<API, DOMAIN> {
    abstract fun toDomain(api: API): DOMAIN
}