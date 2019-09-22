package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());


        int i = 0;
        int mi = 0;
        int minimum = min(a, b);
        System.out.println("Minimum = " + minimum);
        while (i < 5) {
            int c = Integer.parseInt(reader.readLine());
            if (i == 0) {
                mi = c;
            }
            i++;
            if (i > 0) {
                if (c < mi || c == mi) {
                    mi = c;
                }

            }
            if (i == 5) {

                System.out.println("Minimum = " + mi);
                break;
            }

        }


    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int mi = 0;
        int mi2 = 0;
        int minimum =0;

        if (a <= b) {
            mi = a;
        } else if (a > b) {
            mi = b;
        }
        if (c <= d) {
            mi2 = c;
        } else if (c > d) {
            mi2 = d;
        }
        if (mi <= mi2) {
            minimum= mi;
        } else if (mi > mi2) {
            minimum = mi2;
        }
        return minimum;

    }
}
