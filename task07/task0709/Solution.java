package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> array= new ArrayList<>();
        int indexMin=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            String s = reader.readLine();
            array.add(i,s);
        }
        indexMin= array.get(0).length();
        for (int i=0;i<array.size();i++){
            if(indexMin>array.get(i).length()){
                indexMin=array.get(i).length();
            }
        }
        for(int i=0;i<array.size();i++){
            if(array.get(i).length()==indexMin){
                System.out.println(array.get(i));
            }
        }
    }
}

/*
* Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.**/
