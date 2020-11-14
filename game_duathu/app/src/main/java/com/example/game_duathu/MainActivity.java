package com.example.game_duathu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    CheckBox cbone;
    CheckBox cbotwo;
    CheckBox cbthree;
    SeekBar sboone;
    SeekBar sbtwo;
    SeekBar sbthree;
    TextView demdiem;
    ImageButton Run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        cbone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    // bo 2 va 3
                    Toast.makeText(MainActivity.this, "Ban Cuoc Dieu", Toast.LENGTH_SHORT).show();
                    cbotwo.setChecked(false);
                    cbthree.setChecked(false);
                }
            }
        });
        cbotwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    // bo 1 va 3
                    Toast.makeText(MainActivity.this, "Ban cuoc Minh", Toast.LENGTH_SHORT).show();
                    cbone.setChecked(false);
                    cbthree.setChecked(false);
                }
            }
        });
        cbthree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    // bo 2 va 1
                    Toast.makeText(MainActivity.this, "Ban cuoc Thong", Toast.LENGTH_SHORT).show();
                    cbotwo.setChecked(false);
                    cbone.setChecked(false);
                }
            }
        });

        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int number = 4;
                Random random = new Random();
                int one = random.nextInt(number);
                int two = random.nextInt(number);
                int three = random.nextInt(number);

                //  xu li win

                if (sboone.getProgress() >= sboone.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "Dieu Win", Toast.LENGTH_SHORT).show();
                    Run.setVisibility(View.VISIBLE);
                }
                if (sbtwo.getProgress() >= sbtwo.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "Minh Win", Toast.LENGTH_SHORT).show();
                    Run.setVisibility(View.VISIBLE);
                }
                if (sbthree.getProgress() >= sbthree.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "Thong Win", Toast.LENGTH_SHORT).show();
                    Run.setVisibility(View.VISIBLE);
                }
                

                sboone.setProgress(sboone.getProgress() + one);
                sbtwo.setProgress(sbtwo.getProgress() + two);
                sbthree.setProgress(sbthree.getProgress() + three);
            }

            @Override
            public void onFinish() {

            }
        };
        Run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sboone.setProgress(0);
                sbtwo.setProgress(0);
                sbthree.setProgress(0);
                Run.setVisibility(View.INVISIBLE);
                countDownTimer.start();
            }
        });
    }

    private void Anhxa() {
        cbone   = (CheckBox) findViewById(R.id.checkboxone);
        cbotwo  = (CheckBox) findViewById(R.id.checkboxtwo);
        cbthree = (CheckBox) findViewById(R.id.checkbothree);
        sboone  = (SeekBar) findViewById(R.id.seebarone);
        sbtwo   = (SeekBar) findViewById(R.id.seebartwo);
        sbthree = (SeekBar) findViewById(R.id.seebarthree);
        demdiem = (TextView) findViewById(R.id.demdiem);
        Run     = (ImageButton) findViewById(R.id.buttonRun);

    }
}