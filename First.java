package com.company;

import java.util.Random;

public class First {
    static int[] StartArray = new int[10];
    static int[] Arr = new int[10];
    static int Counter = 0;
    static final int EqualsValue = 2;
    static Random Random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < StartArray.length; i++){
            StartArray[i] = -2 + Random.nextInt(5);
            System.out.print(StartArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < StartArray.length; i++){
            if(StartArray[i] == EqualsValue){
                Arr[Counter] = i;
                System.out.print(Arr[Counter] + " ");
                Counter++;
            }
        }
    }
}
