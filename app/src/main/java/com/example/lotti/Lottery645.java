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

public class Lottery645 extends AppCompatActivity {

    private TextView lo645Numb1, lo645Numb2, lo645Numb3, lo645Numb4, lo645Numb5, lo645Numb6;
    private Button btn645Start, btnLottery645Back;

    static int[] lotteryNumbers645 = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery645);

        init();


        btn645Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lotteryDraws645();
                //addDatabase();
            }
        });

        btnLottery645Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Lottery645.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }


    private void lotteryDraws645() {
        for (int i = 0; i < 6; i++) {
            lotteryNumbers645[i] = (int) (Math.random() * 45) + 1;
        }

        Arrays.sort(lotteryNumbers645);

        lo645Numb1.setText(MessageFormat.format("{0}", lotteryNumbers645[0]));
        lo645Numb2.setText(MessageFormat.format("{0}", lotteryNumbers645[1]));
        lo645Numb3.setText(MessageFormat.format("{0}", lotteryNumbers645[2]));
        lo645Numb4.setText(MessageFormat.format("{0}", lotteryNumbers645[3]));
        lo645Numb5.setText(MessageFormat.format("{0}", lotteryNumbers645[4]));
        lo645Numb5.setText(MessageFormat.format("{0}", lotteryNumbers645[5]));
    }


    private void init() {
        lo645Numb1 = findViewById(R.id.tvLotteryNumber645Numb1);
        lo645Numb2 = findViewById(R.id.tvLotteryNumber645Numb2);
        lo645Numb3 = findViewById(R.id.tvLotteryNumber645Numb3);
        lo645Numb4 = findViewById(R.id.tvLotteryNumber645Numb4);
        lo645Numb5 = findViewById(R.id.tvLotteryNumber645Numb5);
        lo645Numb6 = findViewById(R.id.tvLotteryNumber645Numb6);
        btn645Start = findViewById(R.id.btn645Start);
        btnLottery645Back = findViewById(R.id.btnLottery645Back);
    }
}