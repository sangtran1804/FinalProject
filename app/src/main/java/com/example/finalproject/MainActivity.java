package com.example.finalproject;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText edtuser;
    EditText edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtuser = (EditText) findViewById(R.id.edtuser);
        edtpass = (EditText) findViewById(R.id.edtpass);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkLogin()) {
                    if (edtuser.getText().toString().equals("1506020052")&& edtpass.getText().toString().equals("123456"))
                    {Toast.makeText(MainActivity.this, "Login Succes !", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, ThuVien_Activity.class);
                    startActivity(intent);
                    }
                }
                else
                    {
                        Toast.makeText(MainActivity.this,"Login Faile !",Toast.LENGTH_LONG).show();
                    }
            }
        });

    }
    private boolean checkLogin()
    {
        if(edtuser.getText().toString().length()<1)
        {
            edtuser.setError("Vui long nhap ten dang nhap cua ban !");
            return false;
        }

        if(edtpass.getText().toString().length()<1)
        {
            edtpass.setError("Vui long nhap mat khau cua ban");
            return false;
        }
        return true;
    }


}
