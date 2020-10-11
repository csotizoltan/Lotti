package com.example.lotti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private TextView textLotteryNumber1, textLotteryNumber2,
            textLotteryNumber3, textLotteryNumber4, textLotteryNumber5;
    private Button btn_start;

    static int[] lotteryNumbers = new int[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LotteryDraws590();
            }

            private void LotteryDraws590() {
                for (int i = 0; i < 5; i++) {
                    lotteryNumbers[i] = (int) (Math.random() * 90) + 1;
                }

                Arrays.sort(lotteryNumbers);

                textLotteryNumber1.setText(MessageFormat.format("{0}", lotteryNumbers[0]));
                textLotteryNumber2.setText(MessageFormat.format("{0}", lotteryNumbers[1]));
                textLotteryNumber3.setText(MessageFormat.format("{0}", lotteryNumbers[2]));
                textLotteryNumber4.setText(MessageFormat.format("{0}", lotteryNumbers[3]));
                textLotteryNumber5.setText(MessageFormat.format("{0}", lotteryNumbers[4]));
            }
        });
    }

    private void init() {
        textLotteryNumber1 = findViewById(R.id.lotteryNumber1);
        textLotteryNumber2 = findViewById(R.id.lotteryNumber2);
        textLotteryNumber3 = findViewById(R.id.lotteryNumber3);
        textLotteryNumber4 = findViewById(R.id.lotteryNumber4);
        textLotteryNumber5 = findViewById(R.id.lotteryNumber5);
        btn_start = findViewById(R.id.btn_start);
    }
}