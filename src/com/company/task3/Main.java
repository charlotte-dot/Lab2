package com.company.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array ={1,3,5,7,11,99};
        reverse(array);
        System.out.println("Reversed array = "+ Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        for(int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
}
