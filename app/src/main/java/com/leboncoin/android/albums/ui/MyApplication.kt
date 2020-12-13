package com.leboncoin.android.albums.ui

import android.app.Application
import com.leboncoin.android.albums.domain.di.koinDomainModules
import com.leboncoin.android.albums.repository.di.koinDataSourceModules
import com.leboncoin.android.albums.ui.di.koinUiModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {

        // Koin
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MyApplication)
            androidFileProperties()
            modules(koinDataSourceModules)
            modules(koinDomainModules)
            modules(koinUiModules)
        }

        super.onCreate()
    }
}