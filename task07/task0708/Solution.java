package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings= new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        int count=1;
        List<String> maximus = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0;i<5;i++){
            String s= reader.readLine();
            strings.add(i,s);

        }
        int max = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++){
            if (max < strings.get(i).length()){
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (max == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }



    }
}


