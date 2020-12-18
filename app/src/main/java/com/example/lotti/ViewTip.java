package com.example.lotti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewTip extends AppCompatActivity {

    private Button btnLottery590Back;
    private TextView tvViewTip;

    DBhelper database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_tip);

        init();
        lotteryNumbersView();

        btnLottery590Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(ViewTip.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }


    private void lotteryNumbersView() {
        Cursor viewTip = database.dateQuuery();

        if (viewTip == null) {
            Toast.makeText(this, "Hiba történt a lekérdezés során!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (viewTip.getCount() == 0) {
            Toast.makeText(this, "Még nincs adat felvéve!", Toast.LENGTH_SHORT).show();
            return;
        }

        StringBuilder builder = new StringBuilder();
        while (viewTip.moveToNext()) {
            builder.append("ID").append(viewTip.getInt(0)).append("\n");
            builder.append(viewTip.getInt(1)).append(", ");
            builder.append(viewTip.getInt(2)).append(", ");
            builder.append(viewTip.getInt(3)).append(", ");
            builder.append(viewTip.getInt(4)).append(", ");
            builder.append(viewTip.getInt(5)).append("\n\n");
            //builder.append(viewTip.getInt(0)).append(", ");
        }

        tvViewTip.setText(builder.toString());
    }

    private void init() {
        btnLottery590Back = findViewById(R.id.btnLottery590Back);
        tvViewTip = findViewById(R.id.tvViewTip);

        database = new DBhelper(ViewTip.this);
    }
}