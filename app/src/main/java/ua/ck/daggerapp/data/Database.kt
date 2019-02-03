package ua.ck.daggerapp.data

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import javax.inject.Inject

class Database @Inject constructor() : AnkoLogger {
    fun getData() {
        info { "Data from Database" }
    }
}