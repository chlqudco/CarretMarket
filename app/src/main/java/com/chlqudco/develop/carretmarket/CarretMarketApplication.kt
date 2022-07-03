package com.chlqudco.develop.carretmarket

import android.app.Application
import com.chlqudco.develop.carretmarket.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

//koin
class CarretMarketApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        //의존성 쥬입?
        startKoin{
            androidLogger(Level.ERROR)
            androidContext(this@CarretMarketApplication)
            modules(appModule)
        }
    }
}