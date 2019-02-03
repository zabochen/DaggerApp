package ua.ck.daggerapp.di

import dagger.Component
import ua.ck.daggerapp.data.Repository

@Component
interface AppComponent {
    fun getRepository(): Repository
}