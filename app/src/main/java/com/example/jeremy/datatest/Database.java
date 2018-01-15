package com.example.jeremy.datatest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jeremy on 26/02/2017.
 */

public class Database extends SQLiteOpenHelper {
    public Database(Context context) {
        super(context, "Voyance.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(SQLConst.CREATE_TABLE_VOYANCES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {



}
    public boolean insertData() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("arrete","oui");

        long result = db.insert("base.db",null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

}
