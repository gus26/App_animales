package com.example.animales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.service.controls.Control;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import controlador.PagerController;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewpager;
    TabItem tab1,tab2,tab3,tab4;
    PagerController pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        viewpager=findViewById(R.id.viewpager);


        tab1=findViewById(R.id.tabPerros);
        tab2=findViewById(R.id.tabGatos);
        tab3=findViewById(R.id.tabCaballos);
        tab4=findViewById(R.id.tabPeces);

        pagerAdapter=new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());
        viewpager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }

                if(tab.getPosition()==1){
                    pagerAdapter.notifyDataSetChanged();
                }

                if(tab.getPosition()==2){
                    pagerAdapter.notifyDataSetChanged();
                }

                if(tab.getPosition()==3){
                    pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
