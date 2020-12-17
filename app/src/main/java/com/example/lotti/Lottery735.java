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

public class Lottery735 extends AppCompatActivity {

    private TextView lo735Numb1, lo735Numb2, lo735Numb3, lo735Numb4, lo735Numb5, lo735Numb6, lo735Numb7;
    private Button btn735Start, btnLottery735Back;

    static int[] lotteryNumbers735 = new int[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery735);

        init();


        btn735Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lotteryDraws735();
                //addDatabase();
            }
        });

        btnLottery735Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Lottery735.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }


    private void lotteryDraws735() {
        for (int i = 0; i < 7; i++) {
            lotteryNumbers735[i] = (int) (Math.random() * 35) + 1;
        }

        Arrays.sort(lotteryNumbers735);

        lo735Numb1.setText(MessageFormat.format("{0}", lotteryNumbers735[0]));
        lo735Numb2.setText(MessageFormat.format("{0}", lotteryNumbers735[1]));
        lo735Numb3.setText(MessageFormat.format("{0}", lotteryNumbers735[2]));
        lo735Numb4.setText(MessageFormat.format("{0}", lotteryNumbers735[3]));
        lo735Numb5.setText(MessageFormat.format("{0}", lotteryNumbers735[4]));
        lo735Numb6.setText(MessageFormat.format("{0}", lotteryNumbers735[5]));
        lo735Numb7.setText(MessageFormat.format("{0}", lotteryNumbers735[6]));
    }


    private void init() {
        lo735Numb1 = findViewById(R.id.tvLotteryNumber735Numb1);
        lo735Numb2 = findViewById(R.id.tvLotteryNumber735Numb2);
        lo735Numb3 = findViewById(R.id.tvLotteryNumber735Numb3);
        lo735Numb4 = findViewById(R.id.tvLotteryNumber735Numb4);
        lo735Numb5 = findViewById(R.id.tvLotteryNumber735Numb5);
        lo735Numb6 = findViewById(R.id.tvLotteryNumber735Numb6);
        lo735Numb7 = findViewById(R.id.tvLotteryNumber735Numb7);
        btn735Start = findViewById(R.id.btn735Start);
        btnLottery735Back = findViewById(R.id.btnLottery735Back);
    }
}