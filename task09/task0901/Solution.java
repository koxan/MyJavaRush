package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements
             ) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements
             ) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElement =Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElement
             ) {
            System.out.println(element.getMethodName());
        }
        return  stackTraceElement;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements
             ) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements
             ) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
}
