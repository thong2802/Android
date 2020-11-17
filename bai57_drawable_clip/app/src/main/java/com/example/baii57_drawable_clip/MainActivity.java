package com.example.baii57_drawable_clip;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
        imageView.setImageLevel(1000) ;
        final ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        int currentLevel =  clipDrawable.getLevel();
                        if (currentLevel >= 10000){
                            currentLevel = 0;
                        }
                        imageView.setImageLevel(currentLevel + 1000);
                        handler.postDelayed(this, 500);
                    }
                },2000);
                */

                CountDownTimer countDownTimer = new CountDownTimer(2000, 500) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int currentLevel =  clipDrawable.getLevel();
                        if (currentLevel >= 10000){
                            currentLevel = 0;
                        }
                        imageView.setImageLevel(currentLevel + 1000);
                    }

                    @Override
                    public void onFinish() {
                      this.start();
                    }
                }.start();

            }
        });

    }
}