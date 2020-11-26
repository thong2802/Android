package com.example.bai66_popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
    }

    // vi popup khon co ham rieng nen ta phai tao funtion showmenu
    private  void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this, btn);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.insert: btn.setText("Insert");
                        Toast.makeText(MainActivity.this, "You choose insert", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cut:btn.setText("Cut");
                        Toast.makeText(MainActivity.this, "You choose insert", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.coppy:btn.setText("Coppy");
                        Toast.makeText(MainActivity.this, "You choose insert", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.delete:btn.setText("Delete");
                        Toast.makeText(MainActivity.this, "You choose insert", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
        popupMenu.show();
    }
}



/*
* PopupMenu hiển thị một Menu trong một cửa sổ bật lên theo phương thức được gắn vào một Chế
* độ xem. Cửa sổ bật lên sẽ xuất hiện bên dưới chế độ xem neo nếu còn chỗ hoặc phía trên nếu không có.
* Nếu IME hiển thị, cửa sổ bật lên sẽ không chồng lên
* nó cho đến khi chạm vào. Chạm vào bên ngoài cửa sổ bật lên sẽ loại bỏ nó.
*
* */