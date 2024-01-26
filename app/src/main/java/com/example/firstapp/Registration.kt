package com.example.firstapp

import CustomAdapter
import ItemsViewModel
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class Registration : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val fifth = findViewById<Button>(R.id.framentbutton)
        fifth.setOnClickListener {
          val  intent = Intent(this, Fragment::class.java)
            startActivity(intent)
        }



        // this code is implement to Recycler_view Purpose
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..25){
            data.add(ItemsViewModel(R.drawable.my_image,  "Item $i"))
        }
        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter




    }




}