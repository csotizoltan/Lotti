package com.example.lotti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;
import java.util.Arrays;

public class Lottery590 extends AppCompatActivity {

    private TextView lo590Numb1, lo590Numb2, lo590Numb3, lo590Numb4, lo590Numb5;
    private Button btn590Start, btnLottery590Back;

    static int[] lotteryNumbers590 = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery590);

        init();


        btn590Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lotteryDraws590();
            }
        });

        btnLottery590Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Lottery590.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }


    private void lotteryDraws590() {
        for (int i = 0; i < 5; i++) {
            lotteryNumbers590[i] = (int) (Math.random() * 90) + 1;
        }

        Arrays.sort(lotteryNumbers590);

        lo590Numb1.setText(MessageFormat.format("{0}", lotteryNumbers590[0]));
        lo590Numb2.setText(MessageFormat.format("{0}", lotteryNumbers590[1]));
        lo590Numb3.setText(MessageFormat.format("{0}", lotteryNumbers590[2]));
        lo590Numb4.setText(MessageFormat.format("{0}", lotteryNumbers590[3]));
        lo590Numb5.setText(MessageFormat.format("{0}", lotteryNumbers590[4]));
    }


    private void init() {
        lo590Numb1 = findViewById(R.id.tvLotteryNumber590Numb1);
        lo590Numb2 = findViewById(R.id.tvLotteryNumber590Numb2);
        lo590Numb3 = findViewById(R.id.tvLotteryNumber590Numb3);
        lo590Numb4 = findViewById(R.id.tvLotteryNumber590Numb4);
        lo590Numb5 = findViewById(R.id.tvLotteryNumber590Numb5);
        btn590Start = findViewById(R.id.btn590Start);
        btnLottery590Back = findViewById(R.id.btnLottery590Back);
    }
}