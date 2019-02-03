package ua.ck.daggerapp

import android.app.Application
import ua.ck.daggerapp.di.AppComponent
import ua.ck.daggerapp.di.DaggerAppComponent
import ua.ck.daggerapp.di.module.NetworkModule

class MainApp : Application() {

    companion object {
        private lateinit var appComponent: AppComponent
        fun appComponent() = appComponent
    }

    override fun onCreate() {
        super.onCreate()
        setDagger()
    }

    private fun setDagger() {
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule("http://localhost"))
            .build()
    }
}