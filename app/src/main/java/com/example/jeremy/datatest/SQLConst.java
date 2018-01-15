package com.example.jeremy.datatest;

/**
 * Created by Jeremy on 18/07/2017.
 */

public class SQLConst {

    public static final String DATABASE_NAME="Voyance.db";
    public static final int DATABASE_VERSION=1;
    public static final String CREATE_TABLE_VOYANCES="CREATE TABLE VOYANCE (id INT PRIMARY KEY NOT NULL autoincrement,voyances text,voyancesPassés text)";
    public static final String InsertVoyances="Insert into VOYANCE (voyances) VALUES ('Vous penser trop souvent a votre bae, calmez vous un peu'), " +
            "('Cette semaine vous avez besoin de rire ne vous genez pas , çela ne peut vous faire que du bien')," +
            "('Vous avez trop dépensé cette semaine, arretez un peu')";

    public static final String CREATE_TABLE_CALENDRIER="CREATE TABLE "+SQLConst.TABLE_NAME_CALENDRIER+" (id INT PRIMARY KEY NOT NULL autoincrement,formatAMJ text,formatHMS text";

    // tables names
    public static final String TABLE_NAME_VOYANCE="VOYANCE";
    public static final String TABLE_NAME_CALENDRIER="CALENDRIER";

}
