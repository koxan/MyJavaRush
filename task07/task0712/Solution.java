package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr= new ArrayList<>();
        int[] number=new int[10];
        int max=0;
        int min=0;
        int indexMin =0;
        int indexMax=0;

        for(int i=0;i<10;i++){
        String s = reader.readLine();
        arr.add(i,s);
        number[i]=arr.get(i).length();
        }
        for (int i=0;i<number.length;i++){
            if(i==0) {
                max = number[i];
                min = number[i];
            }
            if(i>0){
                if(max<number[i]){
                    max=number[i];
                    indexMax=i;
                }
                if(min>number[i]){
                    min=number[i];
                    indexMin = i;
                }
            }

        }
        if(indexMax>indexMin){
            System.out.println(arr.get(indexMin));
        }else{
            System.out.println(arr.get(indexMax));
        }
    }
}
