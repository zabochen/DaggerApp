package ua.ck.daggerapp.data

interface Repository {
    fun getNews(): List<String>
}