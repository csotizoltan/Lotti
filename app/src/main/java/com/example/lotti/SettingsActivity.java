package com.example.lotti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private Button btnSettingsBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        init();

        btnSettingsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                String whichActivity = bundle.getString("activity");

                if (whichActivity.equals("Lottery590")) {
                    Intent main = new Intent(SettingsActivity.this, Lottery590.class);
                    startActivity(main);
                    finish();
                }

                else if (whichActivity.equals("Lottery645")) {
                    Intent main = new Intent(SettingsActivity.this, Lottery645.class);
                    startActivity(main);
                    finish();
                }

                else if (whichActivity.equals("Lottery735")) {
                    Intent main = new Intent(SettingsActivity.this, Lottery735.class);
                    startActivity(main);
                    finish();
                }

                else if (whichActivity.equals("LotteryEurojackpot")) {
                    Intent main = new Intent(SettingsActivity.this, Eurojackpot.class);
                    startActivity(main);
                    finish();
                }

                else if (whichActivity.equals("ViewTip")) {
                    Intent main = new Intent(SettingsActivity.this, ViewTip.class);
                    startActivity(main);
                    finish();
                }

                else if (whichActivity.equals("About")) {
                    Intent main = new Intent(SettingsActivity.this, AboutActivity.class);
                    startActivity(main);
                    finish();
                }

                else {
                    Intent main = new Intent(SettingsActivity.this, MainActivity.class);
                    startActivity(main);
                    finish();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_main:
                Intent main = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(main);
                finish();
                return (true);

            case R.id.about:
                Intent about = new Intent(SettingsActivity.this, AboutActivity.class);
                about.putExtra("activity", "settings");
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
        btnSettingsBack = findViewById(R.id.btnSettingsBack);
    }
}