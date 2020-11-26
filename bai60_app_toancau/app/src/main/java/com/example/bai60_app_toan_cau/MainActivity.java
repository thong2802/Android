package com.example.bai60_app_toan_cau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nhapHoTen;
    EditText nhapSoDienThoai;
    EditText nhapEmail;
    Button btnXacNhan;
    TextView thongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = nhapHoTen.getText().toString();
                String email = nhapEmail.getText().toString();
                String sodienthoai = nhapSoDienThoai.getText().toString();

               String txtChaoban = getResources().getString(R.string.txt_chaoban);
               String txtemail = getResources().getString(R.string.txt_email);
               String txtsodienthoai = getResources().getString(R.string.txt_sodienthoai);

               thongTin.setText(txtChaoban +": " + hoten +"\n" + txtemail+": " + email + "\n" + txtsodienthoai+": " + sodienthoai);
            }
        });
    }
    public  void AnhXa(){
        nhapHoTen = (EditText)findViewById(R.id.nhaphoten);
        nhapEmail = (EditText)findViewById(R.id.nhapemail);
        nhapSoDienThoai = (EditText)findViewById(R.id.nhapsodienthoai);
        btnXacNhan = (Button) findViewById(R.id.xacnhan);
        thongTin = (TextView) findViewById(R.id.textViewThongtin);
    }
}