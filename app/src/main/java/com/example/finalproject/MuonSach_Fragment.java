package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MuonSach_Fragment extends Fragment {
ListView lv_muonsach;
static ArrayList<muonsach> muonsachArrayList;
static muonsach_adapter adapter;
Button btn_themPhieu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        onSetValue();
        View view = inflater.inflate(R.layout.fragment_muon_sach_, container, false);
        lv_muonsach = view.findViewById(R.id.lv_muonsach);
        btn_themPhieu = view.findViewById(R.id.btn_muonsach);
        btn_themPhieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),themphieumuon_Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter = new muonsach_adapter(getContext(),R.layout.danh_sach_phieu_muon, muonsachArrayList);
        lv_muonsach.setAdapter(adapter);
        lv_muonsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                muonsach muonsach = (com.example.finalproject.muonsach) lv_muonsach.getItemAtPosition(position);
                Intent intent;
                intent = new Intent(getActivity(), chitietphieumuon_Activity.class);
                intent.putExtra("CTPMSACH", muonsach);
                startActivity(intent);
            }
        });
    }

    private void onSetValue() {
        muonsachArrayList = new ArrayList<>();
        muonsachArrayList.add(new muonsach("nguyen van a", "truyên ma","1"));
        muonsachArrayList.add(new muonsach("nguyen van b","tieng anh", "1"));
    }
}
