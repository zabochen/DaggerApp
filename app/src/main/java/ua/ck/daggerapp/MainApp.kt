package ua.ck.daggerapp

import android.app.Application
import ua.ck.daggerapp.di.AppComponent
import ua.ck.daggerapp.di.DaggerAppComponent

class MainApp : Application() {

    companion object {
        private lateinit var appComponent: AppComponent
        fun appComponent(): AppComponent = appComponent
    }

    override fun onCreate() {
        super.onCreate()
        setDagger()
    }

    private fun setDagger() {
        appComponent = DaggerAppComponent.builder().build()
    }
}