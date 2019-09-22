package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Виталий",500);
        map.put("Макс",600);
        map.put("Юра",700);
        map.put("Дима",800);
        map.put("Женя",200);
        map.put("Эля",1500);
        map.put("Инна",300);
        map.put("Паша",3500);
        map.put("Гриша",4500);
        map.put("Рома",100);
        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String,Integer> copy = new HashMap<>(map);

        for (Map.Entry<String,Integer> pair1: copy.entrySet()
             ) {
            Integer n = 500;
            for(Map.Entry<String,Integer> pair2: copy.entrySet()){
                if(!pair1.getKey().equals(pair2.getKey())&&pair1.getValue()<n){
                    map.remove(pair1.getKey());
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}

/*
* Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.**/