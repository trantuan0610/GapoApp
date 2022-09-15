package com.tuantd.gapo.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tuantd.gapo.Fragment.*

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return   when(position){
            0->{
                HomeFragment()
            }
            1->{
                GroupFragment()
            }
            2->{
                ChatsFragment()
            }
            3->{
                GroupFragment()
            }
            4->{
                CalendarFragment()
            }
            5->{
                ProfileFragment()
            }
            else->{
                Fragment()
            }

        }
    }
}