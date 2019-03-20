package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int weight;
        private int height;
        private DateFormat  birthday;
        private String lastname;

        public Human(){
            this.name = "Vasya";
            this.age = 15;
            this.weight= 50;
            this.height=160;
            this.lastname="Ivanov";
            this.birthday=new SimpleDateFormat("10.05.1989");
        }
        public Human(String name){
            this.name= name;
        }
        public Human(String name, int age){
            this.name=name;
            this.age=age;
            this.weight= 50;
            this.height=160;
            this.lastname="Ivanov";
            this.birthday=new SimpleDateFormat("10.05.1989");
        }
        public Human(String name, String lastname){
            this.name=name;
            this.age=15;
            this.weight= 50;
            this.height=160;
            this.lastname=lastname;
            this.birthday=new SimpleDateFormat("10.05.1989");
        }
        public Human(String name, String lastname, int age){
            this.name=name;
            this.age=age;
            this.weight= 50;
            this.height=160;
            this.lastname=lastname;
            this.birthday=new SimpleDateFormat("10.05.1989");
        }
        public Human(String name, String lastname, int age, int weight, int height){
            this.name=name;
            this.age=age;
            this.weight= weight;
            this.height=height;
            this.lastname=lastname;
            this.birthday=new SimpleDateFormat("10.05.1989");
        }
        public Human(String name, String lastname, DateFormat birthday){
            this.name=name;
            this.age=15;
            this.weight= 55;
            this.height=160;
            this.lastname=lastname;
            this.birthday=birthday;
        }
        public Human(String name, String lastname, int age, int weight, int height,DateFormat birthday){
            this.name=name;
            this.age=age;
            this.weight= weight;
            this.height=height;
            this.lastname=lastname;
            this.birthday=birthday;
        }
        public Human(String name, DateFormat birthday){
            this.name=name;
            this.age=15;
            this.weight= 55;
            this.height=160;
            this.lastname="Ivanov";
            this.birthday=birthday;
        }
        public Human(String name, DateFormat birthday, int age){
            this.name=name;
            this.age=age;
            this.weight= 55;
            this.height=160;
            this.lastname="Ivanov";
            this.birthday=birthday;
        }

    }
}
