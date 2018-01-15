package com.example.jeremy.datatest;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 30/07/2017.
 */

public class VoyanceBDD {

    private SQLiteDatabase bdd;
    private Database database;
    VoyanceBDD(Context context){
        database=new Database(context);
    }
    public void getVoyances(){
        List<String> voyances = new ArrayList<String>();

        Cursor cursor = bdd.rawQuery("Select * from "+ SQLConst.TABLE_NAME_VOYANCE, null);

        cursor.moveToFirst();
    }

    public String getVoyance(int id){
        String voyance;

        Cursor cursor = bdd.rawQuery("Select * from "+ SQLConst.TABLE_NAME_VOYANCE+ "where id= "+id, null);
        /*Cursor cursor = bdd.query(,
                allColumns, null, null, null, null, null);*/
        cursor.moveToFirst();
        voyance= cursor.getString(1);
        return voyance;

    }


}
