package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class update_sach_Activity extends AppCompatActivity {
Button btn_update;
Button btn_cancel;
TextView tv_update_tensach;
TextView tv_update_theloai;
TextView tv_update_soluong;
String tv_update_ten = "";
String tv_update_loai = "";
String tv_update_so = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_sach_);
        onInit();
        onGetValue();
    }

    private void onGetValue() {
        Intent intent = getIntent();
        thuvien item = (thuvien) intent.getSerializableExtra("UPDATE_SACH");
        tv_update_tensach.setText(item.getTensach());
        tv_update_theloai.setText(item.getTheloai());
        tv_update_soluong.setText(item.getSoluong());
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ValidateForm()){

                }
            }
        });
    }

    private void onInit() {
        btn_update = (Button) findViewById(R.id.update_btn);
        btn_cancel = (Button) findViewById(R.id.cancel_btn);
        tv_update_tensach = (TextView) findViewById(R.id.update_tensach);
        tv_update_theloai = (TextView) findViewById(R.id.update_theloai);
        tv_update_soluong = (TextView) findViewById(R.id.update_soluong);
    }
    private boolean ValidateForm(){
        tv_update_ten = tv_update_tensach.getText().toString();
        tv_update_loai = tv_update_theloai.getText().toString();
        tv_update_so = tv_update_soluong.getText().toString();
        if (tv_update_ten.length() < 1)
        {
            tv_update_tensach.setError("Nhap Ten Sach");
            return false;
        }

        if (tv_update_loai.length() < 1)
        {
            tv_update_theloai.setError("Nhap Loai Sach");
            return false;
        }

        if (tv_update_so.length() < 1)
        {
            tv_update_soluong.setError("Nhap so luong sach");
            return false;
        }
        return true;
    }
}
