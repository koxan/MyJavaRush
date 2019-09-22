package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum=0;
        int count=0;
        double center;

        while (true) {
            String s = reader.readLine();
            int number = Integer.parseInt(s);
            if (number!=-1){
                sum = sum+number;
                count++;
            }else if(number==-1){
                center=sum/count;
                System.out.println(center);
                break;
            }

        }
    }
}

