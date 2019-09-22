package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat cat1 = new Cat("Bobzik","Hello",5);
        Dog dog1 = new Dog("karate",99,78);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat{
        String name;
        String voice;
        int speed;

        public Cat(String name, String voice, int speed) {
            this.name = name;
            this.voice = voice;
            this.speed = speed;
        }
    }
    public static class Dog{
        String name;
        int positivly;
        int countSmile;

        public Dog(String name, int positivly, int countSmile) {
            this.name = name;
            this.positivly = positivly;
            this.countSmile = countSmile;
        }
    }

    //напишите тут ваш код
}
