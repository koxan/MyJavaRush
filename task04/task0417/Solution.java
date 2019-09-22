package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        int a3 = Integer.parseInt(s3);

        if(a1==a2&&a2==a3){
            System.out.print(a1+" "+a2+" "+a3);
        }
        if(a1==a2&&a2!=a3){
            System.out.print(a1 +" "+ a2);
        }
        if(a1==a3&&a3!=a2){
            System.out.print(a1+" "+a3);
        }
        if(a2==a3&&a3!=a1){
            System.out.print(a2+" "+a3);
        }else{

        }


    }
}