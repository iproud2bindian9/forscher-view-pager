package com.forscher.vpdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPageAdapter extends FragmentStatePagerAdapter {

    private static final int no_of_pages = 3;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment f = null;

        switch(i) {
            case 0:
                f = new Frag1();
                break;
            case 1:
                f = new Frag2();
                break;
            case 2:
                f = new Frag1();
                break;

        }

        return f;
    }

    @Override
    public int getCount() {
        return no_of_pages;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return new String ("Fragment"+(position+1));
    }
}
