package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {


        //напишите тут ваш код
        public static void main(String[] args) throws Exception {
            int countplus=0;
            int countminus=0;

            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            String s3 = reader.readLine();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = Integer.parseInt(s3);

            if(a>0){
                countplus=countplus+1;
            }
            if(b>0){
                countplus=countplus+1;
            }
            if(c>0){
                countplus=countplus+1;
            }
            if(a<0){
                countminus=countminus+1;
            }
            if(b<0){
                countminus=countminus+1;
            }
            if(c<0){
                countminus=countminus+1;
            }

            System.out.println("количество отрицательных чисел: "+countminus);
            System.out.println("количество положительных чисел: " +countplus);


        }
}
