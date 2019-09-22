package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s2);

        int i = 0;
        boolean isTrue = true;
        while (isTrue) {
            if (i < a) {
                System.out.println(s1);
                i++;
            } else {
                isTrue = false;
            }

        }
    }
}
