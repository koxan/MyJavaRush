package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String,Cat> myMap = new HashMap<>();
        Cat cat1 = new Cat("Игорек");
        Cat cat2 = new Cat("Васек");
        Cat cat3 = new Cat("Пашок");
        Cat cat4= new Cat("Гришок");
        Cat cat5 = new Cat("Женек");
        Cat cat6 = new Cat("Ванек");
        Cat cat7 = new Cat("Димчик");
        Cat cat8= new Cat("Максик");
        Cat cat9 = new Cat("Федька");
        Cat cat10 = new Cat("Сашка");
        
        myMap.put(cat1.name,cat1);
        myMap.put(cat2.name,cat2);
        myMap.put(cat3.name,cat3);
        myMap.put(cat4.name,cat4);
        myMap.put(cat5.name,cat5);
        myMap.put(cat6.name,cat6);
        myMap.put(cat7.name,cat7);
        myMap.put(cat8.name,cat8);
        myMap.put(cat9.name,cat9);
        myMap.put(cat10.name,cat10);
        
        return myMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> sets = new HashSet<>();

        for (Map.Entry<String,Cat> mapper: map.entrySet()
             ) {
            sets.add(mapper.getValue());
        }

        return sets;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
/*
* Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.**/
