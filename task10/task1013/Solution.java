package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
       private String firstName;
       private String lastName;
       private int age;
       private int telNumber;
       private String city;
       private String workPlace;

        public Human() {
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, String lastName, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
        }

        public Human(String firstName, String lastName, String city, String workPlace) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.workPlace = workPlace;
        }

        public Human(String firstName, String lastName, int age, String city, String workPlace) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
            this.workPlace = workPlace;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age, int telNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.telNumber = telNumber;
        }

        public Human(String firstName, String lastName, int age, int telNumber, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.telNumber = telNumber;
            this.city = city;
        }

        public Human(String firstName, String lastName, int age, int telNumber, String city, String workPlace) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.telNumber = telNumber;
            this.city = city;
            this.workPlace = workPlace;
        }
    }
}
