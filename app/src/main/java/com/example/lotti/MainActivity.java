package com.example.lotti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
                Intent eurojackpot = new Intent(MainActivity.this, LotteryEurojackpot.class);
                startActivity(eurojackpot);
                finish();
            }
        });

        btnMainPevTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewTip = new Intent(MainActivity.this, ViewTip.class);
                viewTip.putExtra("activity", "Main");
                startActivity(viewTip);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Intent settings = new Intent(MainActivity.this, SettingsActivity.class);
                settings.putExtra("activity", "Main");
                startActivity(settings);
                finish();
                return (true);

            case R.id.about:
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                about.putExtra("activity", "Main");
                startActivity(about);
                finish();
                return (true);

            case R.id.exit:
                finish();
                return (true);
        }
        return super.onOptionsItemSelected(item);
    }


    private void init() {
        btnMainLottery590 = findViewById(R.id.btnMainLottery590);
        btnMainLottery645 = findViewById(R.id.btnMainLottery645);
        btnMainLottery735 = findViewById(R.id.btnMainLottery735);
        btnMainEurojackpot = findViewById(R.id.btnMainEurojackpot);
        btnMainPevTip = findViewById(R.id.btnMainPevTip);
    }
}