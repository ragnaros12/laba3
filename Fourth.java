package com.company;

import java.util.Random;

public class Fourth {
    public static int[][] StartArray = new int[5][5];
    static java.util.Random Random = new Random();

    public static void main(String[] args){
        for (int i1 = 0; i1 < StartArray.length; i1++) {
            for (int i = 0; i < StartArray[i1].length; i++) {
                StartArray[i1][i] =  Random.nextInt(5);
                System.out.print(StartArray[i1][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int minInd = StartArray.length - 1;
        for (int i = StartArray.length - 2; i >= 0; i--){
            if(StartArray[StartArray.length - 1 - i][i] < StartArray[StartArray.length - 1 - minInd][minInd]){
                minInd = i;
            }
        }
        System.out.println((StartArray.length - 1 - minInd) + " " + minInd);
    }
}
