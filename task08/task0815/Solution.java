package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String>  map = new HashMap<>();
        map.put("Кохан","Виталий");
        map.put("Берда","Виталий");
        map.put("Хлусов","Виталий");
        map.put("Гусейнова","Элина");
        map.put("Гусейнов","Тимур");
        map.put("Глэйер","Галина");
        map.put("Баканова","Маргарита");
        map.put("Баканов","Павел");
        map.put("Бордеров","Инна");
        map.put("Снитко","Дмитрий");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,String>> first = map.entrySet().iterator();
        int nameCount = 0;
        while(first.hasNext()){
            Map.Entry<String,String> me= first.next();
            if(me.getValue()==name){
                nameCount++;
            }
        }

        System.out.println(nameCount);
        return nameCount;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,String>> last = map.entrySet().iterator();
        int lastNamecount = 0;
        while(last.hasNext()){
            Map.Entry<String,String> me= last.next();
            if(me.getKey()==lastName){
                lastNamecount++;
            }
        }

        System.out.println(lastNamecount);
        return lastNamecount;


    }

    public static void main(String[] args) {

    }
}
