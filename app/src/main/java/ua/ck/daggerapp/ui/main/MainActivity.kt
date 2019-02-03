package ua.ck.daggerapp.ui.main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ua.ck.daggerapp.MainApp
import ua.ck.daggerapp.R
import ua.ck.daggerapp.data.Repository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: Repository

    lateinit var responseTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUi()
        getData()
    }

    private fun setUi() {
        // Layout
        setContentView(R.layout.activity_main)

        // Dagger
        MainApp.appComponent().injectMainActivity(this)

        // Views
        this.responseTextView = findViewById(R.id.activityMain_textView_response)
    }

    private fun getData() {
        this.responseTextView.text = repository.getNews().joinToString()
    }
}
