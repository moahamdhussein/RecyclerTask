package com.example.recyclertask

import android.content.ClipDescription
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class info : AppCompatActivity() {

    private lateinit var image: ImageView
    private lateinit var name: TextView
    private lateinit var description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val obj = intent.getParcelableExtra<movie>("movieInfo")
        image = findViewById(R.id.back)
        name = findViewById(R.id.title)
        description = findViewById(R.id.description)
        image.setBackgroundResource(obj!!.image)
        name.text = obj.name
        description.text = obj.description
    }
}


