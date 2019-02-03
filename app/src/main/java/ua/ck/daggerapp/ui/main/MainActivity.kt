package ua.ck.daggerapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ua.ck.daggerapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUi()
    }

    private fun setUi() {
        setContentView(R.layout.activity_main)
    }
}
