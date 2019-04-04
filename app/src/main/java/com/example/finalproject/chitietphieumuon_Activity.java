package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class chitietphieumuon_Activity extends AppCompatActivity {
TextView id_tennguoimuonsach;
TextView id_tenloaisach;
TextView id_theloai;
TextView id_soluong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietphieumuon_);
        onInIt();
        onGetIntent();
    }



    private void onInIt() {
        id_tennguoimuonsach = (TextView)findViewById(R.id.id_tennguoimuonsach);
        id_tenloaisach = (TextView)findViewById(R.id.id_tensachmuon);
        id_theloai = (TextView)findViewById(R.id.id_theloai);
        id_soluong = (TextView)findViewById(R.id.id_soluong);

    }
    private void onGetIntent() {
        Intent intent = getIntent();
        muonsach muonsach = (com.example.finalproject.muonsach) intent.getSerializableExtra("CTPMSACH");
        id_tennguoimuonsach.setText(String.valueOf(muonsach.getTennguoimuon()));
        id_tenloaisach.setText(String.valueOf(muonsach.getTensachmuon()));
        id_soluong.setText(String.valueOf(muonsach.getSoluong()));
    }
}
