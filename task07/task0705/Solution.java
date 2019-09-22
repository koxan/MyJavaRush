package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arrayBig = new int[20];
        int [] arrayLittleOne = new int[10];
        int [] arrayLittleTwo = new int[10];

        for (int i=0;i<arrayBig.length;i++){
            arrayBig[i]=Integer.parseInt(reader.readLine());

        }
        for (int i=0;i<arrayBig.length;i++){
            if(i<10){
                arrayLittleOne[i]=arrayBig[i];
            }
            if(i>=10){
                arrayLittleTwo[i-10]=arrayBig[i];
            }

        }
        for(int i=0;i<arrayLittleTwo.length;i++){
            System.out.println(arrayLittleTwo[i]);
        }
    }
}
