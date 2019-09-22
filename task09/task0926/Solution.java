package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код

        int [] one =new int[5];
        for (int i = 0; i <one.length ; i++) {
            one[i]=i;
        }
        int [] two =new int[2];
        for (int i = 0; i <two.length ; i++) {
            two[i]=i;
        }
        int [] three =new int[4];
        for (int i = 0; i <three.length ; i++) {
            three[i]=i;
        }
        int [] four =new int[7];
        for (int i = 0; i <four.length ; i++) {
            four[i]=i;
        }
        int [] five =new int[0];
        ArrayList<int[]> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);


        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
