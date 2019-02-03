package ua.ck.daggerapp.di

import dagger.Component
import ua.ck.daggerapp.di.module.RepositoryModule
import ua.ck.daggerapp.ui.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}