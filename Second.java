package com.company;

import java.util.Random;

public class Second {
    static int[] StartArray = new int[10], Arr;
    static int Counter;
    static Random Random = new Random();
    public static void main(String[] args){
        for (int i = 0; i < StartArray.length; i++){
            StartArray[i] = -5 + Random.nextInt(10);
            if(StartArray[i] > 0)
                Counter++;
            System.out.print(StartArray[i] + " ");
        }
        System.out.println();
        Arr = new int[Counter];
        Counter--;
        for (int i = 0; i < StartArray.length; i++){
            if(StartArray[i] > 0){
                Arr[Counter] = StartArray[i] * 5;
                Counter--;
            }
        }
        for (int i = 0; i < Arr.length; i++){
            int min = i;
            for (int j = i + 1; j < Arr.length; j++){
                if(Arr[j] < Arr[min])
                    min = j;
            }
            int var = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = var;
        }

        for (int i = 0; i < Arr.length;i++)
            System.out.print(Arr[i] + " ");
    }
}
