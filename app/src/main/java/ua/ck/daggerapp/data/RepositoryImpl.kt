package ua.ck.daggerapp.data

import ua.ck.daggerapp.data.network.NetworkService

class RepositoryImpl(private val networkService: NetworkService) : Repository {

    override fun getNews(): List<String> {
        return networkService.getData()
    }
}