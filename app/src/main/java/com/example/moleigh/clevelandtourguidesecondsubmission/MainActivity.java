package com.example.moleigh.clevelandtourguidesecondsubmission;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gets the layout for view pager
        ViewPager viewPager = findViewById(R.id.viewpager);

        AttractionFragmentPagerAdapter adapter = new AttractionFragmentPagerAdapter(this, getSupportFragmentManager());
        // connects view pager layout to fragment pager adapter
        viewPager.setAdapter(adapter);

        // creates tabs at the top of the main activity to navigate to the attractions
        TabLayout tabLayout = findViewById(R.id.tabs);
        // connects tabs with view pager
        tabLayout.setupWithViewPager(viewPager);
        // connects the fragments for the individual attractions

    }
}
