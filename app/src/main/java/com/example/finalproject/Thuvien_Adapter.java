package com.example.finalproject;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Thuvien_Adapter extends FragmentStatePagerAdapter {
    List<Fragment> fragmentList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();


    public Thuvien_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }

    public void addFra(Fragment fragment, String title ){
        fragmentList.add(fragment);
        stringList.add(title);
    }
}
