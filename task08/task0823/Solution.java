package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char [] a = s.toCharArray();
        if(a[0]!=' '){
            a[0] = Character.toUpperCase(a[0]);
        }
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==' '&& a[i+1] !=' '){
                a[i+1]=Character.toUpperCase(a[i+1]);
            }
        }
        System.out.println(a);
        //напишите тут ваш код
    }
}
/*
* Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.**/