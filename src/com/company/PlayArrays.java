package com.company;

import java.util.Scanner;

public class PlayArrays {
    public static int[] createInputIntArray(int length){
        int[] userArray = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++){
            System.out.println("Please enter a number to array index #" + i);
            int input = scanner.nextInt();
            userArray[i]= input>0 ? input:0;
        }return userArray;

    }
}
