package com.example.lotti;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DBhelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "lottery.db";
    public static final int DB_VERSION = 1;

    public static final String lOTTERY_TABLE = "lottery590";

    public static final String COL_ID = "id";
    public static final String COL_N1 = "number1";
    public static final String COL_N2 = "number2";
    public static final String COL_N3 = "number3";
    public static final String COL_N4 = "number4";
    public static final String COL_N5 = "number5";
    //public static DateFormat COL_DATE = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS");


    public DBhelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql  = "CREATE TABLE IF NOT EXISTS "+lOTTERY_TABLE+" (" +
                COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_N1+" INTEGER NOT NULL, " +
                COL_N2+" INTEGER NOT NULL, " +
                COL_N3+" INTEGER NOT NULL, " +
                COL_N4+" INTEGER NOT NULL, " +
                COL_N5+" INTEGER NOT NULL " +
                //COL_DATE+" DATETIME NOT NULL " +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + lOTTERY_TABLE;
        db.execSQL(sql);
        onCreate(db);
    }


    public boolean insert(int n1, int n2, int n3, int n4, int n5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_N1, n1);
        values.put(COL_N2, n2);
        values.put(COL_N3, n3);
        values.put(COL_N4, n4);
        values.put(COL_N5, n5);
        //values.put(COL_DATE, date);

        return db.insert(lOTTERY_TABLE, null, values) != -1;
    }


    public Cursor dateQuuery() {
        SQLiteDatabase db = this.getReadableDatabase();
        //return db.rawQuery("SELECT * FROM lottery590 WHERE id = ?", new String[]{"1"});
        return db.rawQuery("SELECT * FROM lottery590", null);
    }
}
