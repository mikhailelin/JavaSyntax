package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfatherName = new Cat(grandfatherName);
        String grandmotherName = reader.readLine();
        Cat catGrandmotherName = new Cat(grandmotherName);

        String faherName = reader.readLine();
        Cat catFather = new Cat(faherName, null,catGrandfatherName);
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandmotherName, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfatherName);
        System.out.println(catGrandmotherName);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if(mother == null && father == null) {
                return "Cat name is " + name + ", no mother, no father";
            }
            if (father == null){
                return "Cat name is " + name + ", mother is " + mother.name + ", no father ";
            }
            if (mother == null)
                return "Cat name is " + name + ", no mother " + ", father is " + father.name;
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
