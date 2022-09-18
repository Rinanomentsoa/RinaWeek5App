package com.example.viewpager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.ViewPagerAdapter
import com.example.viewpager.fragments.first
import com.example.viewpager.fragments.second

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout=findViewById(R.id.tabs)

        viewPager=findViewById(R.id.viewPager)
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            when(position){
                0 ->tab.text = "NEWS"
                1 -> tab.text = "FAVORITE"
            }
    }.attach()
    }
}
