package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);

        if(a>10){
            a=a%10;
        }
        if(a>=0&&a<3||a>=5&&a<8||a==10){
            System.out.println("зеленый");
        }
        if(a>=3&&a<4||a>=8&&a<9){
            System.out.println("желтый");
        }
        if(a>=4&&a<5||a>=9&&a<10){
            System.out.println("красный");
        }

    }
}