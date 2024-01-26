package com.example.firstapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Fragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val button = findViewById<Button>(R.id.gotonav)
        button.setOnClickListener {
            val intent = Intent(this, NavActivity::class.java)
            startActivity(intent)
        }

        val viewPager : ViewPager2 = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tablayout)

        val adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        adapter.addFragment(LoginFragment(), "Login")
        adapter.addFragment(SignUpFragment(), "Register")
        adapter.addFragment(BlankFragment(), "Calls")

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){
          tab, position -> tab.text = adapter.getPageTitle(position)
        }.attach()

    }
}