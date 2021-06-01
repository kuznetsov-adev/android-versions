package com.itmo.androidversions

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itmo.androidversions.data.Android
import java.lang.IllegalArgumentException

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val android = intent?.getParcelableExtra<Android>(ARGS_VERSION) ?: throw IllegalArgumentException("Missing argument")
    }

    companion object {
        private const val ARGS_VERSION = "ARGS_VERSION"

        fun createIntent(context: Context, android: Android): Intent {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra(ARGS_VERSION, android)
            return intent
        }
    }
}