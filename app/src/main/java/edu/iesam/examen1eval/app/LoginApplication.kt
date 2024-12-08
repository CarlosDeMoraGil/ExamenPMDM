package edu.iesam.examen1eval.app

import android.app.Application
import edu.iesam.examen1eval.app.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class LoginApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@LoginApplication)
            modules( AppModule().module )
        }

    }
}