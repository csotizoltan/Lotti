package com.example.lotti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button btnAboutBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        init();

        btnAboutBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                String whichActivity = bundle.getString("activity");

                if (whichActivity.equals("Lottery590")) {
                    Intent Lottery590 = new Intent(AboutActivity.this, Lottery590.class);
                    startActivity(Lottery590);
                    finish();
                }

                else if (whichActivity.equals("Lottery645")) {
                    Intent Lottery645 = new Intent(AboutActivity.this, Lottery645.class);
                    startActivity(Lottery645);
                    finish();
                }

                else if (whichActivity.equals("Lottery735")) {
                    Intent Lottery735 = new Intent(AboutActivity.this, Lottery735.class);
                    startActivity(Lottery735);
                    finish();
                }

                else if (whichActivity.equals("LotteryEurojackpot")) {
                    Intent LotteryEurojackpot = new Intent(AboutActivity.this, com.example.lotti.LotteryEurojackpot.class);
                    startActivity(LotteryEurojackpot);
                    finish();
                }

                else if (whichActivity.equals("ViewTip")) {
                    Intent ViewTip = new Intent(AboutActivity.this, ViewTip.class);
                    startActivity(ViewTip);
                    finish();
                }

                else if (whichActivity.equals("settings")) {
                    Intent settings = new Intent(AboutActivity.this, SettingsActivity.class);
                    settings.putExtra("activity", "About");
                    startActivity(settings);
                    finish();
                }

                else {
                    Intent main = new Intent(AboutActivity.this, MainActivity.class);
                    startActivity(main);
                    finish();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_main:
                Intent main = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(main);
                finish();
                return (true);

            case R.id.settings:
                Intent settings = new Intent(AboutActivity.this, SettingsActivity.class);
                startActivity(settings);
                finish();
                return (true);

            case R.id.about:
                Intent about = new Intent(AboutActivity.this, AboutActivity.class);
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
        btnAboutBack = findViewById(R.id.btnAboutBack);
    }
}