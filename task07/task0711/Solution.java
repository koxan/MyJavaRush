package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr= new ArrayList<>();

        for (int i=0;i<5;i++){
            arr.add(i, reader.readLine());
        }
        for (int i=0;i<13;i++){
            String a=arr.get(arr.size()-1);
            arr.add(0,a);
            arr.remove(arr.size()-1);

        }
        for (String q:arr
                ) {
            System.out.println(q);
        }
    }
}
