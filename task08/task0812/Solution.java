package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            int a = Integer.parseInt(reader.readLine());
            list.add(i,a);
        }


        int all=0;
        int re =1;
        int max = list.get(0);
        int count = 1;
        for (int i = 0; i <=list.size()-1 ; i++) {
            if(i>0&&max==list.get(i)){
                re++;
                count++;
            }
            if (list.get(i)!=max){
                re=1;

                count=1;
                max=list.get(i);
            }
            if(count>all) {
                all=count;
            }

        }
        System.out.println(all);

    }
}