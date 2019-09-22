package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        int []array = new int[b];
        if(b>0){
            for(int i=0;i<b;i++) {
                int a = Integer.parseInt(reader.readLine());
                array[i]=a;
            }
            Arrays.sort(array);

            int max = array[b-1];
            System.out.println(max);
        }


    }
}

