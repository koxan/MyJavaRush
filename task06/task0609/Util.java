package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import  java.lang.Math.*;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a = (x2-x1)*(x2-x1);
        double b = (y2-y1)*(y2-y1);

        double distance  =  Math.sqrt(a+b);
        return distance;

    }


    public static void main(String[] args) {

    }
}
