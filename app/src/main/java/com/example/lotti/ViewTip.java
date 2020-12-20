package com.example.lotti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ViewTip extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button btnLottery590Back;
    private TextView tvViewTip;

    private Spinner ViewTipLotteryType;
    private static final String[] lotteryType = {"Ötöslottó", "Hatoslottó", "Skandináv lottó", "Eurojackpot"};

    DBhelper database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_tip);

        init();
        viewTipSpinner();

        btnLottery590Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(ViewTip.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }

    private void viewTipSpinner() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ViewTip.this,
                android.R.layout.simple_spinner_item, lotteryType);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ViewTipLotteryType.setAdapter(adapter);
        ViewTipLotteryType.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                lotteryNumbersView590();
                break;
            case 1:
                lotteryNumbersView645();
                break;
            case 2:
                lotteryNumbersView735();
                break;
            case 3:
                lotteryNumbersViewEurojackpot();
                break;
        }
        ((TextView) parent.getChildAt(0)).setTextColor(getResources().getColor(R.color.btnStartTextColor));
        ((TextView) parent.getChildAt(0)).setTextSize(18);
        ((TextView) parent.getChildAt(0)).setPadding(27, 3, 0, 3);
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private void lotteryNumbersView590() {
        Cursor viewTip = database.dataQueryLottery590();

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
            //builder.append("ID").append(viewTip.getInt(0)).append("\n");
            builder.append(viewTip.getInt(1)).append(", ");
            builder.append(viewTip.getInt(2)).append(", ");
            builder.append(viewTip.getInt(3)).append(", ");
            builder.append(viewTip.getInt(4)).append(", ");
            builder.append(viewTip.getInt(5));
            builder.append("\n\nA tipp időpontja: ");
            builder.append((viewTip.getString(6)).substring(0, 16)).append("\n\n");
        }

        tvViewTip.setText(builder.toString());
    }


    private void lotteryNumbersView645() {
        Cursor viewTip = database.dataQueryLottery645();

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
            //builder.append("ID").append(viewTip.getInt(0)).append("\n");
            builder.append(viewTip.getInt(1)).append(", ");
            builder.append(viewTip.getInt(2)).append(", ");
            builder.append(viewTip.getInt(3)).append(", ");
            builder.append(viewTip.getInt(4)).append(", ");
            builder.append(viewTip.getInt(5)).append(", ");
            builder.append(viewTip.getInt(6));
            builder.append("\n\nA tipp időpontja: ");
            builder.append((viewTip.getString(7)).substring(0, 16)).append("\n\n");
        }

        tvViewTip.setText(builder.toString());
    }


    private void lotteryNumbersView735() {
        Cursor viewTip = database.dataQueryLottery735();

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
            //builder.append("ID").append(viewTip.getInt(0)).append("\n");
            builder.append(viewTip.getInt(1)).append(", ");
            builder.append(viewTip.getInt(2)).append(", ");
            builder.append(viewTip.getInt(3)).append(", ");
            builder.append(viewTip.getInt(4)).append(", ");
            builder.append(viewTip.getInt(5)).append(", ");
            builder.append(viewTip.getInt(6)).append(", ");
            builder.append(viewTip.getInt(7));
            builder.append("\n\nA tipp időpontja: ");
            builder.append((viewTip.getString(8)).substring(0, 16)).append("\n\n");
        }

        tvViewTip.setText(builder.toString());
    }


    private void lotteryNumbersViewEurojackpot() {
        Cursor viewTip = database.dataQueryLotteryEurojackpot();

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
            //builder.append("ID").append(viewTip.getInt(0)).append("\n");
            builder.append("A mező\n");
            builder.append(viewTip.getInt(1)).append(", ");
            builder.append(viewTip.getInt(2)).append(", ");
            builder.append(viewTip.getInt(3)).append(", ");
            builder.append(viewTip.getInt(4)).append(", ");
            builder.append(viewTip.getInt(5)).append(" \n\n");
            builder.append("B mező\n");
            builder.append(viewTip.getInt(6)).append(", ");
            builder.append(viewTip.getInt(7));
            builder.append("\n\nA tipp időpontja: ");
            builder.append((viewTip.getString(8)).substring(0, 16)).append("\n\n");
        }

        tvViewTip.setText(builder.toString());
    }


    private void init() {
        btnLottery590Back = findViewById(R.id.btnLottery590Back);
        tvViewTip = findViewById(R.id.tvViewTip);
        ViewTipLotteryType = findViewById(R.id.spViewTipLotteryType);

        tvViewTip.setMovementMethod(new ScrollingMovementMethod());

        database = new DBhelper(ViewTip.this);

    }
}