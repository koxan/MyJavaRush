package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if(a<b&&a<c&&b>c&&b>a){
            System.out.println(c);
        }
        if (a == b && b == c || a == b && b < c || a == b && b > c||a==c&&a<b||a==c&&a>b||a<c&&c>b&&a>b||a<b&&a>c&&b>c) {
            System.out.println(a);
        } else if (b == c && a > b || b == c && a < b || a > b && b > c||a<b&&a<c&&b<c) {
            System.out.println(b);
        }else if(a>b&&a>c&&b<c){
            System.out.println(c);
        }

    }
}
