package com.company;

import java.util.Random;
import java.util.Vector;

public class Third {
    static int[][] StartArray = new int[10][10];
    static Vector<Integer> MinCounts = new Vector<>();
    static Random Random = new Random();

    public static void main(String[] args){
        for (int i1 = 0; i1 < StartArray.length; i1++) {
            for (int i = 0; i < StartArray[i1].length; i++) {
                StartArray[i1][i] = -5 + Random.nextInt(10);
                System.out.print(StartArray[i1][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i1 = 0; i1 < StartArray.length; i1++){
            MinCounts.add(0);
            for (int i = 0; i < StartArray[i1].length; i++){
                if(StartArray[i1][i] >= 0){
                    MinCounts.set(i1, MinCounts.get(i1)+1);
                }
            }
        }

        for (Integer i : MinCounts){
            System.out.print(i + " ");
        }
    }

}
