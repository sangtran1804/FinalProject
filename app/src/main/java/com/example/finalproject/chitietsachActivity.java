package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class chitietsachActivity extends AppCompatActivity {
    TextView tv_ten;
    TextView tv_soluong;
    TextView tv_theloai;
    TextView tacgia;
    TextView nxb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietsach);
        onInit();
        ongetIntent();
    }
    private void onInit() {
        tv_ten = (TextView)findViewById(R.id.tv_ct_tensach);
        tv_soluong = (TextView)findViewById(R.id.tv_ct_soluong);
        tv_theloai = (TextView)findViewById(R.id.tv_ct_theloai);
        tacgia = (TextView) findViewById(R.id.tacgia);
        nxb = (TextView)findViewById(R.id.nxb);


    }
    private void ongetIntent() {
        Intent intent = getIntent();
        thuvien thuvien =(com.example.finalproject.thuvien) intent.getSerializableExtra("CTSACH");
        tv_ten.setText(String.valueOf(thuvien.getTensach()));
        tv_theloai.setText(String.valueOf(thuvien.getTheloai()));
        tv_soluong.setText(String.valueOf(thuvien.getSoluong()));
        tacgia.setText(String.valueOf(thuvien.getTacgia()));
        nxb.setText(String.valueOf(thuvien.getNxb()));
    }
}
