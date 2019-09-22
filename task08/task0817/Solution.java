package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Кохан","Виталий");
        map.put("Онипченко","Владислав");
        map.put("Горбузов","Виталий");
        map.put("Олежко","Олег");
        map.put("Корыто","Борис");
        map.put("Ансамлев","Игорь");
        map.put("Борисов","Алабай");
        map.put("Грищенко","Валентина");
        map.put("Отец","Василий");
        map.put("Короб","Михаил");

        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String,String> copy = new HashMap<>(map);
        for (Map.Entry<String,String> pair1 : copy.entrySet()
             ) {
            for (Map.Entry<String,String> pair2: copy.entrySet()
                 ) {
                if(!pair1.getKey().equals(pair2.getKey())&&pair1.getValue().equals(pair2.getValue())){
                    removeItemFromMapByValue(map,pair1.getValue());
                }
            }
        }



    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

/*
* Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().**/
