package ua.ck.daggerapp.data

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import javax.inject.Inject

class Network @Inject constructor() : AnkoLogger {
    fun getData() {
        info { "Data from Network" }
    }
}