package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {
        // find missing number in below array
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
                76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        for(int i=1; i<array.length; i++) {
            int bigNum1 = array[i];
            int smallNum2 = array[i-1];
            // In the above array[] we can observe that, common difference between two consecutive numbers is 1
            int difference = bigNum1-smallNum2;
            if(difference != 1) {
                /* n=1 as min difference for which loop would run is 1, which is also the expected common difference. This loop
                will especially take care of the scenarios in which numbers are missing consecutively */
                for(int n=1; n<difference; n++) {
                    int missingNum = smallNum2 + n;
                    System.out.println("Missing number is : " + missingNum);
                }
            }
        }

        // print array for fun
        // printNSizeArray(100);
    }

    private static int[] printNSizeArray (int arraySize) {
        int[] arrayOfNSize = new int[arraySize];
        for(int i=0; i< arrayOfNSize.length; i++) {
            // since we don't want to start from 0 in a rare case
            arrayOfNSize[i] = i+1;
        }
        System.out.println(Arrays.toString(arrayOfNSize));
        return arrayOfNSize;
    }
}
