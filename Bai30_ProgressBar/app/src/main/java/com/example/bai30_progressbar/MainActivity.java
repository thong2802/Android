package com.example.bai30_progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     ProgressBar progressBarxuli;
     Button Download;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        Download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownTimer countDownTimer = new CountDownTimer(10000,500) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int current = progressBarxuli.getProgress();
                        if (current >= progressBarxuli.getMax()) {
                            current = 0;
                        }
                        progressBarxuli.setProgress(current + 10);
                    }

                    @Override
                    public void onFinish() {
                        this.start();
                        Toast.makeText(MainActivity.this, "Hoan Thanh", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });

    }

    public void Anhxa(){
        progressBarxuli = (ProgressBar) findViewById(R.id.progressBar);
        Download = (Button) findViewById(R.id.button);
    }
}