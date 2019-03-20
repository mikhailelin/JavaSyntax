package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

 //       System.out.println("Input pair of values: Integer and String");
 //       System.out.println("Input Integer");
        String strX= reader.readLine();

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        while(!(strX.equals(""))){
            int id = Integer.parseInt(strX);
            String name;
//            System.out.println("Input string. string not must null");
            name = reader.readLine();
            if(name.equals("")) break;
            map.put(name, id);
 //           System.out.println("Input pair of values: Integer and String");
 //           System.out.println("Input Integer");
            strX = reader.readLine();
        };

        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue()+" "+pair.getKey());
        }

    }
}
