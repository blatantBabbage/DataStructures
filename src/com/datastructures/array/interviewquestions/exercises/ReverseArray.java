package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] array) {
        for(int i=0; i<array.length/2; i++) {
            int indexOfEndHalf = array.length-1-i;
            int temp = array[i];
            array[i] = array[indexOfEndHalf];
            array[indexOfEndHalf] = temp;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5});
    }
}
