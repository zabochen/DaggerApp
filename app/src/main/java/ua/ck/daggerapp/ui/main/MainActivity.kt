package ua.ck.daggerapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ua.ck.daggerapp.MainApp
import ua.ck.daggerapp.R
import ua.ck.daggerapp.data.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUi()
        getData()
    }

    private fun setUi() {
        // Layout
        setContentView(R.layout.activity_main)

        // Init repository
        this.repository = MainApp.appComponent().getRepository()
    }

    private fun getData() {
        if (::repository.isInitialized) {
            repository.getDataFromDatabase()
            repository.getDataFromNetwork()
        }
    }
}
