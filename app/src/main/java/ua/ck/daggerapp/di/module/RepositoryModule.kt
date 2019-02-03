package ua.ck.daggerapp.di.module

import dagger.Module
import dagger.Provides
import ua.ck.daggerapp.data.Repository
import ua.ck.daggerapp.data.RepositoryImpl
import ua.ck.daggerapp.data.network.NetworkService

@Module(includes = [NetworkModule::class])
class RepositoryModule {

    @Provides
    fun getRepository(networkService: NetworkService): Repository {
        return RepositoryImpl(networkService)
    }
}