package com.example.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class themsach_Activity extends AppCompatActivity {
Button btn_cancel;
Button btn_add;
EditText add_tensach;
EditText add_theloai;
EditText add_soluong;
String mtensach = "";
String mtheloai = "";
String msoluong = "";
String mtacgia = "";
String mnxb = "";
EditText add_tacgia;
EditText add_nxb;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themsach_);
        onInit();

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckInput()){
                    int id = Sach_Fragment.thuvienArrayList.get( Sach_Fragment.thuvienArrayList.size() - 1).getId() +1;
                    thuvien themsach = new thuvien(mtensach,mtheloai,msoluong,id,mtacgia,mnxb);
                    Sach_Fragment.thuvienArrayList.add(themsach);
                    finish();

                }
            }
        });

    }

    private void onInit() {
        btn_add = (Button) findViewById(R.id.btn_add_sach);
        btn_cancel = (Button) findViewById(R.id.btn_cancel_sach);
        add_tensach = (EditText) findViewById(R.id.edttensach_add);
        add_theloai = (EditText) findViewById(R.id.edttheloai_add);
        add_soluong = (EditText) findViewById(R.id.edtsoluong_add);
        add_tacgia = (EditText) findViewById(R.id.edttacgia);
        add_nxb = (EditText) findViewById(R.id.edtnhaxuatban);

    }
    public boolean CheckInput(){
        mtensach = add_tensach.getText().toString();
        mtheloai = add_theloai.getText().toString();
        msoluong = add_soluong.getText().toString();
        mtacgia = add_tacgia.getText().toString();
        mnxb = add_nxb.getText().toString();
        if (mtensach.length() < 1){
            add_tensach.setError("nhap ten sach");
            return false;
        }
        if (mtheloai.length() < 1){
            add_theloai.setError("nhap the loai sach");
            return false;
        }if (msoluong.length() < 1){
            add_soluong.setError("nhap so luong sach");
            return false;
        }
        if (mtacgia.length() < 1){
            add_tacgia.setError("nhap ten tac gia");
        }
        if (mnxb.length()<1){
            add_nxb.setError("nhap ten nha xuat ban");
        }
        return true;
    }
}
