package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int left,int top,int width,int height){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }
    public void initialize(int left,int top){

        this.left=left;
        this.top=top;
        this.width=0;
        this.height=0;
    }
    public void initialize(int width){

        this.left=width;
        this.top=width;
        this.width=width;
        this.height=width;
    }
    public void initialize(Rectangle rect){

        rect.left=left;
        rect.top=top;
        rect.width=width;
        rect.height=height;
    }




    public static void main(String[] args) {

    }
}
/*
* Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Rectangle должны быть переменные top, left, width и height с типом int.
3. У класса должен быть хотя бы один метод initialize.
4. У класса должно быть хотя бы два метода initialize.
5. У класса должно быть хотя бы три метода initialize.
6. У класса должно быть хотя бы четыре метода initialize.**/