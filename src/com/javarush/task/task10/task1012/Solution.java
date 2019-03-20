package com.javarush.task.task10.task1012;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        ArrayList<Integer> alphabetValue= new ArrayList<Integer>();
        for (int i = 0; i <alphabet.size() ; i++) {
            alphabetValue.add(0);
        }

        for (int i = 0; i <list.size() ; i++) {
            char[] strX = list.get(i).toCharArray();
            for (int j = 0; j <strX.length ; j++) {
                for (int k = 0; k <alphabet.size() ; k++) {
                    if(alphabet.get(k)==strX[j]){
                        int x = alphabetValue.get(k);
                        x++;
                        alphabetValue.set(k,x);
                    }
                }
            }
        }

        for (int i = 0; i <alphabet.size() ; i++) {
            System.out.println(alphabet.get(i)+" "+alphabetValue.get(i));
        }
    }

}
