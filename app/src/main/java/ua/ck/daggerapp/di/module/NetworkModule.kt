package ua.ck.daggerapp.di.module

import dagger.Module
import dagger.Provides
import ua.ck.daggerapp.data.network.NetworkService
import javax.inject.Singleton

@Module
class NetworkModule(private val url: String) {

    @Singleton
    @Provides
    fun getNetworkService() = NetworkService(url)
}