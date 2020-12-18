package com.example.lotti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMainLottery590, btnMainLottery645, btnMainLottery735, btnMainEurojackpot, btnMainPevTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        listeners();
    }


    private void listeners() {
        btnMainLottery590.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lottery590 = new Intent(MainActivity.this, Lottery590.class);
                startActivity(lottery590);
                finish();
            }
        });

        btnMainLottery645.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lottery645 = new Intent(MainActivity.this, Lottery645.class);
                startActivity(lottery645);
                finish();
            }
        });

        btnMainLottery735.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lottery735 = new Intent(MainActivity.this, Lottery735.class);
                startActivity(lottery735);
                finish();
            }
        });

        btnMainEurojackpot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eurojackpot = new Intent(MainActivity.this, Eurojackpot.class);
                startActivity(eurojackpot);
                finish();
            }
        });

        btnMainPevTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewTip = new Intent(MainActivity.this, ViewTip.class);
                startActivity(viewTip);
                finish();
            }
        });
    }


    private void init() {
        btnMainLottery590 = findViewById(R.id.btnMainLottery590);
        btnMainLottery645 = findViewById(R.id.btnMainLottery645);
        btnMainLottery735 = findViewById(R.id.btnMainLottery735);
        btnMainEurojackpot = findViewById(R.id.btnMainEurojackpot);
        btnMainPevTip = findViewById(R.id.btnMainPevTip);
    }
}