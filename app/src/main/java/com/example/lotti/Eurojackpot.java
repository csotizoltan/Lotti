package com.example.lotti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Eurojackpot extends AppCompatActivity {

    private TextView tvEurojackpotANumber1, tvEurojackpotANumber2, tvEurojackpotANumber3, tvEurojackpotANumber4,
            tvEurojackpotANumber5, tvEurojackpotBNumber1, tvEurojackpotBNumber2;
    private Button btnEurojackpotStart, btnEurojackpotBack;

    static int[] eurojackpotANumbers = new int[5];
    static int[] eurojackpotBNumbers = new int[2];

    DBhelper database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurojackpot);

        init();


        btnEurojackpotStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eurojackpot();
                addDatabase();
            }
        });

        btnEurojackpotBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Eurojackpot.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }


    private void eurojackpot() {
        for (int i = 0; i < 5; i++) {
            eurojackpotANumbers[i] = (int) (Math.random() * 50) + 1;
        }

        Arrays.sort(eurojackpotANumbers);


        for (int i = 0; i < 2; i++) {
            eurojackpotBNumbers[i] = (int) (Math.random() * 10) + 1;
        }

        Arrays.sort(eurojackpotBNumbers);

        tvEurojackpotANumber1.setText(MessageFormat.format("{0}", eurojackpotANumbers[0]));
        tvEurojackpotANumber2.setText(MessageFormat.format("{0}", eurojackpotANumbers[1]));
        tvEurojackpotANumber3.setText(MessageFormat.format("{0}", eurojackpotANumbers[2]));
        tvEurojackpotANumber4.setText(MessageFormat.format("{0}", eurojackpotANumbers[3]));
        tvEurojackpotANumber5.setText(MessageFormat.format("{0}", eurojackpotANumbers[4]));
        tvEurojackpotBNumber1.setText(MessageFormat.format("{0}", eurojackpotBNumbers[0]));
        tvEurojackpotBNumber2.setText(MessageFormat.format("{0}", eurojackpotBNumbers[1]));
    }


    private void addDatabase() {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat currentDateTime = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss",  Locale.getDefault());
        String date = currentDateTime.format(calendar.getTime());

        if (database.insertLotteryEurojackpot(eurojackpotANumbers[0], eurojackpotANumbers[1], eurojackpotANumbers[2],
                eurojackpotANumbers[3], eurojackpotANumbers[4], eurojackpotBNumbers[0], eurojackpotBNumbers[1], date)) {
            Toast.makeText(this, "Sikeres rögzítés", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Sikertelen rögzítés", Toast.LENGTH_SHORT).show();
        }
    }


    private void init() {
        tvEurojackpotANumber1 = findViewById(R.id.tvEurojackpotANumber1);
        tvEurojackpotANumber2 = findViewById(R.id.tvEurojackpotANumber2);
        tvEurojackpotANumber3 = findViewById(R.id.tvEurojackpotANumber3);
        tvEurojackpotANumber4 = findViewById(R.id.tvEurojackpotANumber4);
        tvEurojackpotANumber5 = findViewById(R.id.tvEurojackpotANumber5);
        tvEurojackpotBNumber1 = findViewById(R.id.tvEurojackpotBNumber1);
        tvEurojackpotBNumber2 = findViewById(R.id.tvEurojackpotBNumber2);
        btnEurojackpotStart = findViewById(R.id.btnEurojackpotStart);
        btnEurojackpotBack = findViewById(R.id.btnEurojackpotBack);

        database = new DBhelper(Eurojackpot.this);
    }
}