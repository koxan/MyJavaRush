package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");

        String dateString = format.format( new Date()   );
        System.out.println(dateString);
    }
}
