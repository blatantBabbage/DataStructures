package com.datastructures.array;

import java.util.Arrays;

public class CreatingArray {
    public static void main(String[] args) {

        /*
        Below are the steps(1...3) to create an Array using O(n) time complexity
         */

        // step 1: declaring an array, this will basically just create a reference of the name intNumbers in memory
        int[] intNumbers;

        /* step 2: instantiating array of size 3, this will allocate 3 contagious blocks of memory, with 0 as the default value
        of each block
         */
        intNumbers = new int[3];

        // step 3: initializing array by assigning value to each memory block
        intNumbers[0] = 1;
        intNumbers[1] = 2;
        intNumbers[2] = 3;

        // printing intNumbers the array
        System.out.println(Arrays.toString(intNumbers));

        /* Alternatively all above step could be combined into 1 step of, O(1) time complexity */
        int simpleIntNumber[] = {1, 2, 3};

        // printing simpleIntNumber the array
        System.out.println(Arrays.toString(simpleIntNumber));
    }
}
