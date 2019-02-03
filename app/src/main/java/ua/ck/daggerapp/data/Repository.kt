package ua.ck.daggerapp.data

import javax.inject.Inject

class Repository @Inject constructor(private val database: Database, private val network: Network) {
    fun getDataFromDatabase() {
        this.database.getData()
    }

    fun getDataFromNetwork() {
        this.network.getData()
    }
}