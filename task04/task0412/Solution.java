package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if(a>0){
            a=a*2;
            System.out.println(a);
        }
        if(a==0){
            System.out.println(a);
        }
        if(a<0){
            a=a+1;
            System.out.println(a);
        }


    }

}