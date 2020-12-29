package com.example.lotti;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBhelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "lottery.db";
    public static final int DB_VERSION = 1;


    // ----------- Lottery 5/90 -----------

    public static final String lOTTERY_TABLE_590 = "lottery590";

    public static final String COL_ID_590 = "id";
    public static final String COL_N1_590 = "number1";
    public static final String COL_N2_590 = "number2";
    public static final String COL_N3_590 = "number3";
    public static final String COL_N4_590 = "number4";
    public static final String COL_N5_590 = "number5";
    public static final String COL_DATE_590 = "date";


    // ----------- Lottery 6/45 -----------

    public static final String lOTTERY_TABLE_645 = "lottery645";

    public static final String COL_ID_645 = "id";
    public static final String COL_N1_645 = "number1";
    public static final String COL_N2_645 = "number2";
    public static final String COL_N3_645 = "number3";
    public static final String COL_N4_645 = "number4";
    public static final String COL_N5_645 = "number5";
    public static final String COL_N6_645 = "number6";
    public static final String COL_DATE_645 = "date";


    // ----------- Lottery 7/35 -----------

    public static final String lOTTERY_TABLE_735 = "lottery735";

    public static final String COL_ID_735 = "id";
    public static final String COL_N1_735 = "number1";
    public static final String COL_N2_735 = "number2";
    public static final String COL_N3_735 = "number3";
    public static final String COL_N4_735 = "number4";
    public static final String COL_N5_735 = "number5";
    public static final String COL_N6_735 = "number6";
    public static final String COL_N7_735 = "number7";
    public static final String COL_DATE_735 = "date";


    // ----------- Lottery LotteryEurojackpot -----------

    public static final String lOTTERY_TABLE_Eurojackpot = "lotteryEurojackpot";

    public static final String COL_ID_Eurojackpot = "id";
    public static final String COL_AN1_Eurojackpot = "ANumber1";
    public static final String COL_AN2_Eurojackpot = "ANumber2";
    public static final String COL_AN3_Eurojackpot = "ANumber3";
    public static final String COL_AN4_Eurojackpot = "ANumber4";
    public static final String COL_AN5_Eurojackpot = "ANumber5";
    public static final String COL_BN1_Eurojackpot = "BNumber1";
    public static final String COL_BN2_Eurojackpot = "BNumber2";
    public static final String COL_DATE_Eurojackpot = "date";


    public DBhelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql590  = "CREATE TABLE IF NOT EXISTS "+lOTTERY_TABLE_590+" (" +
                COL_ID_590+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_N1_590+" INTEGER NOT NULL, " +
                COL_N2_590+" INTEGER NOT NULL, " +
                COL_N3_590+" INTEGER NOT NULL, " +
                COL_N4_590+" INTEGER NOT NULL, " +
                COL_N5_590+" INTEGER NOT NULL, " +
                COL_DATE_590+" VARCHAR(63) NOT NULL " +
                ")";
        db.execSQL(sql590);

        String sql645  = "CREATE TABLE IF NOT EXISTS "+lOTTERY_TABLE_645+" (" +
                COL_ID_645+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_N1_645+" INTEGER NOT NULL, " +
                COL_N2_645+" INTEGER NOT NULL, " +
                COL_N3_645+" INTEGER NOT NULL, " +
                COL_N4_645+" INTEGER NOT NULL, " +
                COL_N5_645+" INTEGER NOT NULL, " +
                COL_N6_645+" INTEGER NOT NULL, " +
                COL_DATE_645+" VARCHAR(63) NOT NULL " +
                ")";
        db.execSQL(sql645);

        String sql735  = "CREATE TABLE IF NOT EXISTS "+lOTTERY_TABLE_735+" (" +
                COL_ID_735+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_N1_735+" INTEGER NOT NULL, " +
                COL_N2_735+" INTEGER NOT NULL, " +
                COL_N3_735+" INTEGER NOT NULL, " +
                COL_N4_735+" INTEGER NOT NULL, " +
                COL_N5_735+" INTEGER NOT NULL, " +
                COL_N6_735+" INTEGER NOT NULL, " +
                COL_N7_735+" INTEGER NOT NULL, " +
                COL_DATE_735+" VARCHAR(63) NOT NULL " +
                ")";
        db.execSQL(sql735);

        String sqlEurojackpot  = "CREATE TABLE IF NOT EXISTS "+lOTTERY_TABLE_Eurojackpot+" (" +
                COL_ID_Eurojackpot+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_AN1_Eurojackpot+" INTEGER NOT NULL, " +
                COL_AN2_Eurojackpot+" INTEGER NOT NULL, " +
                COL_AN3_Eurojackpot+" INTEGER NOT NULL, " +
                COL_AN4_Eurojackpot+" INTEGER NOT NULL, " +
                COL_AN5_Eurojackpot+" INTEGER NOT NULL, " +
                COL_BN1_Eurojackpot+" INTEGER NOT NULL, " +
                COL_BN2_Eurojackpot+" INTEGER NOT NULL, " +
                COL_DATE_Eurojackpot+" VARCHAR(63) NOT NULL " +
                ")";
        db.execSQL(sqlEurojackpot);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql590 = "DROP TABLE IF EXISTS " + lOTTERY_TABLE_590;
        db.execSQL(sql590);

        String sql645 = "DROP TABLE IF EXISTS " + lOTTERY_TABLE_645;
        db.execSQL(sql645);
        onCreate(db);

        String sql735 = "DROP TABLE IF EXISTS " + lOTTERY_TABLE_735;
        db.execSQL(sql735);
        onCreate(db);

        String sqlEurojackpot = "DROP TABLE IF EXISTS " + lOTTERY_TABLE_Eurojackpot;
        db.execSQL(sqlEurojackpot);
        onCreate(db);
    }


    public boolean insertLottery590(int n1, int n2, int n3, int n4, int n5, String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_N1_590, n1);
        values.put(COL_N2_590, n2);
        values.put(COL_N3_590, n3);
        values.put(COL_N4_590, n4);
        values.put(COL_N5_590, n5);
        values.put(COL_DATE_590, date);

        return db.insert(lOTTERY_TABLE_590, null, values) != -1;
    }


    public boolean insertLottery645(int n1, int n2, int n3, int n4, int n5, int n6, String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_N1_645, n1);
        values.put(COL_N2_645, n2);
        values.put(COL_N3_645, n3);
        values.put(COL_N4_645, n4);
        values.put(COL_N5_645, n5);
        values.put(COL_N6_645, n6);
        values.put(COL_DATE_645, date);

        return db.insert(lOTTERY_TABLE_645, null, values) != -1;
    }


    public boolean insertLottery735(int n1, int n2, int n3, int n4, int n5, int n6, int n7, String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_N1_735, n1);
        values.put(COL_N2_735, n2);
        values.put(COL_N3_735, n3);
        values.put(COL_N4_735, n4);
        values.put(COL_N5_735, n5);
        values.put(COL_N6_735, n6);
        values.put(COL_N7_735, n7);
        values.put(COL_DATE_735, date);

        return db.insert(lOTTERY_TABLE_735, null, values) != -1;
    }


    public boolean insertLotteryEurojackpot(int aN1, int aN2, int aN3, int aN4, int aN5, int bN1, int bN2, String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_AN1_Eurojackpot, aN1);
        values.put(COL_AN2_Eurojackpot, aN2);
        values.put(COL_AN3_Eurojackpot, aN3);
        values.put(COL_AN4_Eurojackpot, aN4);
        values.put(COL_AN5_Eurojackpot, aN5);
        values.put(COL_BN1_Eurojackpot, bN1);
        values.put(COL_BN2_Eurojackpot, bN2);
        values.put(COL_DATE_Eurojackpot, date);

        return db.insert(lOTTERY_TABLE_Eurojackpot, null, values) != -1;
    }


    public Cursor dataQueryLottery590() {
        SQLiteDatabase db = this.getReadableDatabase();
        //return db.rawQuery("SELECT * FROM lottery590 WHERE id = ?", new String[]{"1"});
        return db.rawQuery("SELECT * FROM lottery590", null);
    }

    public Cursor dataQueryLottery645() {
        SQLiteDatabase db = this.getReadableDatabase();
        //return db.rawQuery("SELECT * FROM lottery645 WHERE id = ?", new String[]{"1"});
        return db.rawQuery("SELECT * FROM lottery645", null);
    }

    public Cursor dataQueryLottery735() {
        SQLiteDatabase db = this.getReadableDatabase();
        //return db.rawQuery("SELECT * FROM lottery735 WHERE id = ?", new String[]{"1"});
        return db.rawQuery("SELECT * FROM lottery735", null);
    }

    public Cursor dataQueryLotteryEurojackpot() {
        SQLiteDatabase db = this.getReadableDatabase();
        //return db.rawQuery("SELECT * FROM lotteryEurojackpot WHERE id = ?", new String[]{"1"});
        return db.rawQuery("SELECT * FROM lotteryEurojackpot", null);
    }
}
