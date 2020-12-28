package com.example.lotti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ViewTipListViewActivity extends AppCompatActivity {

    private Button btnViewTipBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_tip_list_view);

        init();

        btnViewTipBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(ViewTipListViewActivity.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view_tip_list_view, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_main:
                Intent main = new Intent(ViewTipListViewActivity.this, MainActivity.class);
                startActivity(main);
                finish();
                return (true);

            case R.id.settings:
                Intent settings = new Intent(ViewTipListViewActivity.this, SettingsActivity.class);
                settings.putExtra("activity", "ViewTip");
                startActivity(settings);
                finish();
                return (true);

            case R.id.about:
                Intent about = new Intent(ViewTipListViewActivity.this, AboutActivity.class);
                about.putExtra("activity", "ViewTip");
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
        btnViewTipBack = findViewById(R.id.btnViewTipBack);
    }
}