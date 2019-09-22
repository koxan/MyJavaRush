package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 5;
        this.color = "White";
        this.address=null;
    }

    public Cat(String name, int weight,int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "White";
        this.address=null;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "White";
        this.address=null;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name=null;
        this.address=null;
        this.age=3;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age=2;

    }


    public static void main(String[] args) {

    }
}

