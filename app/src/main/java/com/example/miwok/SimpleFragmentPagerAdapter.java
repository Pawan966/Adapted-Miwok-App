package com.example.miwok;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{

    private Context context;
    private String tabTitles[] = new String[] { "Numbers", "Family Members", "Colors", "Phrases" };

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyMembersFragment();
        } else if (position==2){
            return new ColorsFragment();
        }
        else if(position==3){
            return new PhrasesFragment();
        }
        else{
            return null;
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}
