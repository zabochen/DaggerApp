package ua.ck.daggerapp.data.network

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class NetworkService(private val url: String) : AnkoLogger {

    init {
        info { "NetworkService: $url" }
    }

    fun getData(): List<String> {
        return listOf("News_1", "News_2", "News_3", "News_4", "News_5")
    }
}