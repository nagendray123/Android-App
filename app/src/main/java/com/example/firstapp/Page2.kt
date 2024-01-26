package com.example.firstapp

import Item
import MyAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)


        val second = findViewById<Button>(R.id.register_button)
        second.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
//            finish()
        }


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager =  LinearLayoutManager(this)
        val adapter = MyAdapter()
        recyclerView.adapter = adapter


//        val data = listOf(
//            Item(1, "Item 1", "Queen", R.drawable.my_image),
//            Item(2, "Item 2", "Ranchi", R.drawable.back87),
//            Item(3, "Item 3", "Jharkhand", R.drawable.juice),
//            Item(4, "Item 4", "Cute", R.drawable.mix),
//            Item(5, "Item 5", "Take", R.drawable.lemon),
//            Item(6, "Item 6", "Indore", R.drawable.orange),
//            Item(7, "Item 7", "Bangalore", R.drawable.tomato),
//            Item(8, "Item 8", "Sand", R.drawable.mix),
//            Item(9, "Item 9", "Manipur", R.drawable.back87),
//            Item(10,"Item 10","Raipur", R.drawable.orange),
//            )

//        adapter.submitList(data)


        val data = mutableListOf<Item>()
        for(i in 1..25){
            data.add(Item(1, "Bangalore$i", "Karnataka $i", R.drawable.back87))
        }
        adapter.submitList(data)

    }
}
