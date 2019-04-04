package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Sach_Fragment extends Fragment {
    ListView listView;
Button btnthemsach;
static ArrayList<thuvien> thuvienArrayList;
static sach_adapter adapter;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        onSetValue();
        View view = inflater.inflate(R.layout.fragment_sach_, container, false);
        listView = view.findViewById(R.id.lv_sach);
        btnthemsach = (Button) view.findViewById(R.id.btn_them_sach);
        btnthemsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),themsach_Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter = new sach_adapter(getContext(),R.layout.sach,thuvienArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                thuvien thuvien = (com.example.finalproject.thuvien) listView.getItemAtPosition(position);
                Intent intent;
                intent = new Intent( getActivity() , chitietsachActivity.class );
                intent.putExtra("CTSACH", thuvien);
                startActivity(intent);
            }
        });
    }
    private void onSetValue() {
    thuvienArrayList = new ArrayList<>();
    thuvienArrayList.add(new thuvien("Tieng anh","giáo dục","1", 0, "john", "giao duc" ));
    thuvienArrayList.add(new thuvien("truyen ma","kinh di","2",1, "nguyen ngoc ngan", "kim dong"));
    thuvienArrayList.add(new thuvien("tieu thuyet","truyen","3",2, "to mat", "kim dong"));
    }
}
