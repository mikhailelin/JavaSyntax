package com.javarush.task.task10.task1015;

import java.util.*;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arr= (ArrayList<String>[])new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "1", "5", "6", "11", "3", "15", "7", "8");
        arr[0]=list1;
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, "A", "B", "C", "D", "E", "F", "G", "H");
        arr[1]=list2;

        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}