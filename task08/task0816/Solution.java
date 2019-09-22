package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM dd yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", df.parse("JUNE 1 1980"));
        map.put("Stallone2", df.parse("JULY 1 1980"));
        map.put("Stallone3", df.parse("AUGUST 1 1980"));
        map.put("Stallone4", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallone5", df.parse("OCTOBER 1 1980"));
        map.put("Stallone6", df.parse("NOVEMBER 1 1980"));
        map.put("Stallone7", df.parse("DECEMBER 1 1980"));
        map.put("Stallone8", df.parse("JANUARY 1 1980"));
        map.put("Stallone9", df.parse("FEBRUARY 1 1980"));
        map.put("Stallone10", df.parse("MARCH 1 1980"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Date>> itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            HashMap.Entry<String, Date> pair = itr.next();

            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
                itr.remove();
        }


    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());

    }
}
/*
* Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.**/