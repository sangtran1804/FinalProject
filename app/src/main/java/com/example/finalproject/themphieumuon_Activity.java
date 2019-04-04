package com.example.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class themphieumuon_Activity extends AppCompatActivity {
String mtennguoimuon = "";
String mtensachmuon = "";
String msoluong = "";
Button huyphieu;
Button themphieu;
EditText edt_tennguoimuon;
EditText edt_tensachmuon;
EditText edt_soluongmuon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themphieumuon_);
        onInit();
        huyphieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        themphieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkInput()){
                    muonsach muonsach = new muonsach(mtennguoimuon,mtensachmuon, msoluong );
                    MuonSach_Fragment.muonsachArrayList.add(muonsach);
                    finish();

                }
            }
        });
    }

    private void onInit() {
        huyphieu = (Button)findViewById(R.id.btn_huyphieumuon);
        themphieu = (Button)findViewById(R.id.btn_them_phieu_muon);
        edt_tennguoimuon = (EditText) findViewById(R.id.edt_themphieumuon);
        edt_tensachmuon = (EditText)findViewById(R.id.edt_tensachmuon);
        edt_soluongmuon = (EditText)findViewById(R.id.edt_soluongsachmuon);
    }
    public boolean checkInput(){
        mtennguoimuon = edt_tennguoimuon.getText().toString();
        mtensachmuon = edt_tensachmuon.getText().toString();
        msoluong = edt_soluongmuon.getText().toString();

        if (mtennguoimuon.length() <1 ){
            edt_tennguoimuon.setError(" Vui long nhap ten nguoi muon");
            return false;
        }
        if (mtensachmuon.length() <1 ){
            edt_tensachmuon.setError(" Vui long nhap ten sach muon");
            return false;
        }
        if (msoluong.length() <1 ){
            edt_soluongmuon.setError(" Vui long nhap so luong sach muon");
            return false;
        }
        return true;
    }
}
