package com.tuantd.gapo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.tuantd.gapo.Adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = this.getColor(R.color.white)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)

        val adapter = ViewPagerAdapter(this, tabLayout.tabCount)

        viewPager2.adapter = adapter

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
        {
            override fun onTabSelected(tab: TabLayout.Tab)
            {
                viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

    }
}