package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true) {
            String s1 = reader.readLine();
            int number = Integer.parseInt(s1);

            if (number!=-1){
                sum=sum+number;
            }
            if(number==-1){
                sum=sum+number;
                System.out.println(sum);
                break;
            }

        }
    }
}
