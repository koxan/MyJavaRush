package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        Human child1 = new Human("мида",false,11);
        Human child2 = new Human("рида",false,12);
        Human child3= new Human("кида",false,14);
        ArrayList<Human> childList = new ArrayList<Human>();
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);

        Human mother = new Human("Тая",false,45,childList);
        Human father = new Human("Артем",true,45,childList);
        ArrayList<Human> mothefatheOne = new ArrayList<Human>();
        ArrayList<Human> mothefatheTwo = new ArrayList<Human>();

        mothefatheOne.add(mother);
        mothefatheTwo.add(father);
        Human grandfa1 = new Human("Гриша",true,77,mothefatheOne);
        Human grandfa2 = new Human("Олег",true,77,mothefatheTwo);
        Human grandmoth1 = new Human("Мария",false,77,mothefatheOne);
        Human grandmoth2 = new Human("Валенсия",false,77,mothefatheTwo);
        ArrayList<Human> grandMothefathe = new ArrayList<Human>();
        grandMothefathe.add(grandfa1);
        grandMothefathe.add(grandfa2);
        grandMothefathe.add(grandmoth1);
        grandMothefathe.add(grandmoth2);


        System.out.println(grandfa2.toString());
        System.out.println(grandfa1.toString());

        System.out.println(grandmoth2.toString());
        System.out.println(grandmoth1.toString());


        System.out.println(mother.toString());
        System.out.println(father.toString());


        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());











    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
/*
* Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать,
 трое детей и выводить все объекты Human на экран.**/