package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;


    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ages = this.age > anotherCat.age?1:0;
        int weights = this.weight > anotherCat.weight ? 1 : 0;
        int strengths = this.strength > anotherCat.strength ? 1 : 0;

        int score = ages + weights + strengths;
        return score > 2;
    }

    public static void main(String[] args) {

    }
}
