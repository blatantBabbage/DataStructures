package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class MaxProductOfTwoInt {
    public static void maxProduct(int[] intArray) {
        int product = 0;
        int[] maxProductIndex = new int[2];
        for(int i=0; i<intArray.length; i++) {
            for(int j = i+1; j<intArray.length; j++) {
                if(intArray[i]*intArray[j] > product) {
                    product = intArray[i]*intArray[j];
                    maxProductIndex[0] = i;
                    maxProductIndex[1] = j;
                }
                continue;
            }
        }
        System.out.println("Max product is : " + product);
        System.out.println("Max product is found at index : " + Arrays.toString(maxProductIndex));
    }

    public static void main(String[] args) {
        int[] array = {10, 30, 50, 20, 40};
        maxProduct(array);
    }
}
