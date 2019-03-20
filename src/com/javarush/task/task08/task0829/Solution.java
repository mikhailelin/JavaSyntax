package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String , String> Set_family = new HashMap<String , String>();
        while (true) {
            String city =  reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            Set_family.put(city,family);
        }

        //read home number
        String city_temp = reader.readLine();

        if (Set_family.containsKey(city_temp)) {
            String familySecondName = Set_family.get(city_temp);
            System.out.println(familySecondName);
        }
    }
}
