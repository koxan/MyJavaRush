package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        LinkedHashMap<Character,Integer> linkmap = new LinkedHashMap<>();
        for (int i = 0; i < abcArray.length; i++) {
            char x = abcArray[i];
            int count = 0;
            for (int j = 0; j <list.size() ; j++) {
                char [] listWord = list.get(j).toCharArray();
                for (int k = 0; k < listWord.length; k++) {
                    if (listWord[k]==x){
                        count++;
                    }
                }

            }
            linkmap.put(x,count);
        }
        for (Map.Entry<Character,Integer> pair : linkmap.entrySet()
                ) {
            System.out.println(pair.getKey()+" "+ pair.getValue());
        }

    }

}
