package com.coconat.fragmenttablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val tabLayout: TabLayout = findViewById(R.id.tabsLayoout)
    val viewPager: ViewPager = findViewById(R.id.viewPager)

        val adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)


    }
}