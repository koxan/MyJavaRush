package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int a,b,c;

        a=number/100;
        b=(number/10)%10;
        c=number%10;
        int sum = a+b+c;
        return sum;


    }
}