package com.example.firstapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
       FragmentStateAdapter(fragmentManager, lifecycle){

    private val fragmentList = mutableListOf<Fragment>()
    private val fragmentation = mutableListOf<String>()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

   fun getPageTitle(position: Int): CharSequence {
        return fragmentation[position]
   }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentation.add(title)
    }

}