package emil.tizzzeik;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SzczegolyPlanu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szczegoly_planu);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout infoPlanTL = findViewById(R.id.infoPlanTL);
        String[] planInfo = new String[3];

        switch(getIntent().getStringExtra("wybranyPlan")) {
            case "planTreningowy1":
                planInfo[0] = getString(R.string.planTreningowy1_opis);
                planInfo[1] = getString(R.string.planTreningowy1_zalecenia);
                planInfo[2] = getString(R.string.planTreningowy1_przeciwwskazania);
                break;
            case "planTreningowy2":
                planInfo[0] = getString(R.string.planTreningowy2_opis);
                planInfo[1] = getString(R.string.planTreningowy2_zalecenia);
                planInfo[2] = getString(R.string.planTreningowy2_przeciwwskazania);
                break;
            case "planZywieniowy1":
                planInfo[0] = getString(R.string.planZywieniowy1_opis);
                planInfo[1] = getString(R.string.planZywieniowy1_zalecenia);
                planInfo[2] = getString(R.string.planZywieniowy1_przeciwwskazania);
                break;
            case "planZywieniowy2":
                planInfo[0] = getString(R.string.planZywieniowy2_opis);
                planInfo[1] = getString(R.string.planZywieniowy2_zalecenia);
                planInfo[2] = getString(R.string.planZywieniowy2_przeciwwskazania);
                break;

                default:
                    planInfo[0] = "brak";
                    planInfo[1] = "brak";
                    planInfo[2] = "brak";
                    break;
        }

        PagerAdapter pageAdapter = new emil.tizzzeik.PagerAdapter(getSupportFragmentManager(), infoPlanTL.getTabCount(), planInfo);
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(infoPlanTL));
        infoPlanTL.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
