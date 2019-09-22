package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {


    public static int even;
    public static int odd;


    public Solution() {
    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        int a = Integer.parseInt(s);
        int b;
        for(int i =0;i<s.length();i++){
            b=a%10;
            if(b%2==0||a==0){
                even++;
            }else if(b%2!=0){
                odd++;
            }
            a=a/10;
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
