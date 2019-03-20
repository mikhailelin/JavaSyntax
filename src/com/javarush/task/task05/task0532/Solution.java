package com.javarush.task.task05.task0532;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        do {
            a=Integer.parseInt(reader.readLine());
            if(a<=0) System.out.println("Input number more 0");
        }while (a <=0);

        int maximum = Integer.parseInt(reader.readLine());;
        for(int i=1; i< a; i++) {
            int b = Integer.parseInt(reader.readLine());
            maximum = maximum > b ? maximum : b;
        }


        //напишите тут ваш код

        System.out.println(maximum);
    }
}
