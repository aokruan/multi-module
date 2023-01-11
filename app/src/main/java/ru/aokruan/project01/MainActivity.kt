package ru.aokruan.project01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import ru.aokruan.project01.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedViewModel.cats.observe(this) { findViewById<TextView>(R.id.textView).text = it.toString() }


        findViewById<Button>(R.id.button_get_cats).setOnClickListener { sharedViewModel.getAllCats() }
    }
}