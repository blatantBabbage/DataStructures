package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class MiddleFunction {

    // This function takes an array and returns a new array that contains all but the first and last elements.
    public static int[] middle(int[] array) {
        int[] midArr = new int[(array.length-2)];
        for(int i=1; i<(array.length-1); i++) {
            midArr[i-1] = array[i];
        }
        System.out.println(Arrays.toString(midArr));
        return midArr;
    }

    public static void main(String[] args) {
        int[] fullArr = {5,6,7,8,9};
        middle(fullArr);
    }
}
