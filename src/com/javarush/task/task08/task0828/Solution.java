package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strX = reader.readLine();
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        System.out.println(strX+" is "+ (list.indexOf(strX)+1)+" month");        
    }
}
