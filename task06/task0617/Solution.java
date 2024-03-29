package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //напишите тут ваш код
    public static class Idea{
        public String getDescription(){

            return "Бааааам";
        }
    }
    public static void printIdea(Idea idea){
        String st = idea.getDescription();
        System.out.println(st);
    }
}

/*
* Блокнот для новых идей
1. В классе Solution создать public static класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить на экран описание идеи - это то, что возвращает метод getDescription


Требования:
1. В классе Solution создать public static класс Idea.
2. В классе Idea создать метод public String getDescription().
3. Метод getDescription должен возвращать любой непустой текст.
4. В классе Solution создайте метод public static void printIdea(Idea idea).
5. Метод printIdea должен выводить описание идеи на экран.**/