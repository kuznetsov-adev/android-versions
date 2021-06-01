package com.itmo.androidversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.itmo.androidversions.data.DataStorage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val android = DataStorage.getVersionsList()
        val versions = DataStorage.getVersionsList()
        val adapter = AndroidAdapter(this, versions) {position ->
            val androids = android[position]
            val intent = DetailsActivity.createIntent(this, androids)
            startActivity(intent)
        }
        val list = findViewById<RecyclerView>(R.id.androidList)
        list.adapter = adapter

        val decoration = DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL)
        ContextCompat.getDrawable(this, R.color.grey)?.let { decoration.setDrawable(it) }
        list.addItemDecoration(decoration)


    }
}