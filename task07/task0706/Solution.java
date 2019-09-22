package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arrayInt = new int[15];
        int count4et=0;
        int countne4et=0;

        for(int i=0;i<arrayInt.length;i++){
            arrayInt[i]=Integer.parseInt(reader.readLine());

            if(i%2==0){
                count4et=count4et+arrayInt[i];
            }
            if(i%2!=0){
                countne4et=countne4et+arrayInt[i];
            }

        }

        if(count4et>countne4et){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else if(count4et<countne4et){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}