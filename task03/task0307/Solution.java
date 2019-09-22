package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg one=new Zerg();
        one.name="as";
        Zerg two=new Zerg();
        two.name="qw";
        Zerg tre=new Zerg();
        tre.name="zx";
        Zerg fo=new Zerg();
        fo.name="xc";
        Zerg five=new Zerg();
        five.name="cv";

        Protoss pro1= new Protoss();
        pro1.name="df";
        Protoss pro2= new Protoss();
        pro2.name="er";
        Protoss pro3= new Protoss();
        pro3.name="rt";


        Terran ter1=new Terran();
        ter1.name="gh";
        Terran ter2=new Terran();
        ter2.name="ah";
        Terran ter3=new Terran();
        ter3.name="ay";
        Terran ter4=new Terran();
        ter4.name="am";



    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
