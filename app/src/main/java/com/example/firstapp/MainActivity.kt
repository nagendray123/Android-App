package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_SHORT).show()
//        Log.d("TAG", "onCreate: I am Running")

        val second = findViewById<Button>(R.id.Button)
         second.setOnClickListener {
            val intent = Intent(this,Page2::class.java)
            startActivity(intent)
        }

    }

    // Activity LifeCycle

//    override fun onStart() {
//        super.onStart()
//        Log.d("TAG", "onStart: I am Running")
//        Toast.makeText(applicationContext, "Start Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("TAG", "onResume: I am Running")
//        Toast.makeText(application,"Resume Called", Toast.LENGTH_SHORT).show()
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("TAG", "onPause: I am Running")
//        Toast.makeText(applicationContext, "Pause Called", Toast.LENGTH_SHORT).show()
//    }

//    override fun onStop() {
//        super.onStop()
//        Log.d("TAG", "onStop: I am Running")
//        Toast.makeText(applicationContext, "Stop Called", Toast.LENGTH_SHORT).show()
//   }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.d("TAG", "onRestart: I am Running")
//        Toast.makeText(applicationContext, "Restart Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("TAG", "onDestroy: I am Running")
//        Toast.makeText(applicationContext, "Delete Called", Toast.LENGTH_SHORT).show()
//    }

}