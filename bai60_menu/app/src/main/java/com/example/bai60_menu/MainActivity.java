package com.example.bai60_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu_tutorials, menu);

        // If you want Icon display in Overflow Menu.
        // https://stackoverflow.com/questions/19750635/icon-in-menu-not-showing-in-android
        if(menu instanceof MenuBuilder){
            MenuBuilder  m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.open:
                Toast.makeText(this, "You choose Open", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(this, "You choose share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.facbook:
                Toast.makeText(this, "You choose Share Facebook", Toast.LENGTH_SHORT).show();
                break;
            case R.id.instagram:
                Toast.makeText(this, "You choose Share Instagram", Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "You choose Delete", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "You choose Settings", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}