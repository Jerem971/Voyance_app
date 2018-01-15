package com.example.jeremy.datatest;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Jeremy on 22/07/2017.
 */

public class Calendrier {

    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    Calendrier(){
        simpleDateFormat=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss", Locale.FRANCE);
        calendar=Calendar.getInstance();
    }

    /**
     * Methode permettant de determiner si un jour est passé entre la derniere voyance et la voyance actuelle
     * @return
     */
    public boolean calculerJour(){
        calendar=simpleDateFormat.getCalendar();
        String date=simpleDateFormat.format(calendar.getTime());
        String tab[]=date.split(".",0);
        boolean isValid=false;

    }




}
