package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/


public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        for (int i = 0; i <elements.length ; i++) {
//
//            System.out.print(elements[i].getClassName()+" : "+elements[i].getMethodName());
//            if (i==elements.length-1)
//            System.out.print(" : " +s);
//        }
        System.out.print(elements[2].getClassName()+": "+elements[2].getMethodName()+": "+s);
    }
}

/*
* Логирование стек-трейса
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution: main: In main method


Требования:
1. Метод log должен выводить сообщение на экран.
2. Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
3. Выведенное сообщение должно содержать имя метода, который вызвал метод log.
4. Выведенное сообщение должно содержать переданное сообщение.
5. Вывод должен соответствовать примеру из задания.**/
