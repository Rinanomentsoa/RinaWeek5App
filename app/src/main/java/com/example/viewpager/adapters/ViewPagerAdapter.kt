package com.example.viewpager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragments.first
import com.example.viewpager.fragments.second


class ViewPagerAdapter (fm: FragmentManager, lf:Lifecycle): FragmentStateAdapter(fm,lf){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> first()
            1 -> second()
            else -> first()
        }
    }

}