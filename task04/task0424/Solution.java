package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();


        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int idx1=1;
        int idx2=2;
        int idx3=3;


        if(a>c&&c==b||a<c&&c==b){
            System.out.println(idx1);
        }else if(a>b&&a==c||a<b&&a==c){
            System.out.println(idx2);
        }else if(c>b&&a==b||c<b&&a==b){
            System.out.println(idx3);
        }

    }
}
