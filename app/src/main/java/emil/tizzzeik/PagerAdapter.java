package emil.tizzzeik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import emil.tizzzeik.OpisFragment;
import emil.tizzzeik.PrzeciwwskazaniaFragment;
import emil.tizzzeik.ZaleceniaFragment;

class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    String[] infopPlanTreningowy;

    public PagerAdapter (FragmentManager fm, int NumOfTabs, String[] infoPlanTreningowy) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.infopPlanTreningowy = infoPlanTreningowy;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                OpisFragment opis = new OpisFragment();
                Bundle opisBundle = new Bundle();
                opisBundle.putString("opis", infopPlanTreningowy[0]);
                opis.setArguments(opisBundle);
                return opis;
            case 1:
                ZaleceniaFragment zalecenia = new ZaleceniaFragment();
                Bundle zaleceniaBundle = new Bundle();
                zaleceniaBundle.putString("zalecenia", infopPlanTreningowy[1]);
                zalecenia.setArguments(zaleceniaBundle);
                return zalecenia;
            case 2:
                PrzeciwwskazaniaFragment przeciwwskazania = new PrzeciwwskazaniaFragment();
                Bundle przeciwBundle = new Bundle();
                przeciwBundle.putString("przeciwwskazania", infopPlanTreningowy[2]);
                przeciwwskazania.setArguments(przeciwBundle);
                return przeciwwskazania;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}