package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateString = reader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        Date date = simpleDateFormat.parse(dateString);
        SimpleDateFormat simpleDateFormatOut = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(simpleDateFormatOut.format(date).toUpperCase());

    }
}