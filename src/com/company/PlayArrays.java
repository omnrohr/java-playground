package com.company;

import java.util.Arrays;
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
    public int[] sortArrayMyOwnApply(int[] myArray){
        int[] sortedArray = new int[myArray.length];
        for (int i = 0; i<myArray.length; i++){
            sortedArray[i]=myArray[i];
        }
        int temp=0;
        boolean flag= true;
        while (flag){
            flag=false;
            for (int i = 0; i<sortedArray.length-1; i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]= temp;
                    flag = true;
                }
            }
        }return sortedArray;
    }
    public void checkArrayReferences(){
        int[] myArray = new int[5];

        int[] anotherArray = myArray;

        System.out.println(" First array " + Arrays.toString(myArray) + " Another array "+ Arrays.toString(anotherArray) );
        anotherArray[2]=11;
        System.out.println(" First array after change " + Arrays.toString(myArray) + " Another array after change"+ Arrays.toString(anotherArray) );
    }


}
