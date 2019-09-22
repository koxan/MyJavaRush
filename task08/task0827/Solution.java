package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy",Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar(2019,4,11);
        String s = date;
        ArrayList<String> list = new ArrayList<>();
        String sMonth = list.get(0);
        String sDay = list.get(1);
        String sYear = list.get(2);
        int y =Integer.parseInt(sYear);
        int d = Integer.parseInt(sDay);



        for (String del: s.split(" ")
                ) {
            list.add(del);
            System.out.println(del);
        }

        calendar.get(Calendar.DAY_OF_YEAR);
        calendar.set(Calendar.MONTH,sMonth);
        if(Calendar.DAY_OF_YEAR%2==0&&Calendar.DAY_OF_YEAR==0){
            System.out.print(dateFormat.format(calendar.getTime())+" ");
            return true;
        }else {
            System.out.print(dateFormat.format(calendar.getTime()) + " ");
            return false;
        }
    }
}
/*
* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().**/
