package com.coconat.fragmenttablayout

  import androidx.fragment.app.Fragment
  import androidx.fragment.app.FragmentManager
  import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter  : FragmentPagerAdapter{
    constructor(fragmentManager: FragmentManager) : super(fragmentManager)

    override fun getCount(): Int {
       return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> return ChatsFragment()
            1-> return  StatusFragment()
            2-> return CallsFragment()
            else-> return UpdatesFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0-> return "Chats"
            1->  return "Status"
            2->  return "Calls"
            else-> return "Updates"
        }
    }
}