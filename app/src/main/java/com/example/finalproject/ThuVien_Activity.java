package com.example.finalproject;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ThuVien_Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

   // ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_vien_);

        onInit();
        tabLayout.setupWithViewPager(viewPager);
        onFragment();
    }

    private void onFragment() {
        Thuvien_Adapter adapter = new Thuvien_Adapter(getSupportFragmentManager());
        adapter.addFra(new Sach_Fragment(),"Sach");
        adapter.addFra(new MuonSach_Fragment(),"Muon Sach");
        viewPager.setAdapter(adapter);
    }

    private void onInit() {
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);


 }


}
