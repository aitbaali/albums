package com.leboncoin.android.albums.ui.common

abstract class BaseUiMapper<DOMAIN, UI> {
    abstract fun toUi(domain: DOMAIN): UI
}