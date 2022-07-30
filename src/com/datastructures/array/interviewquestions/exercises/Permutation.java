package com.datastructures.array.interviewquestions.exercises;

public class Permutation {
    public static boolean isPermutation(int[] array1, int[] array2) {

        /*
        Add comments describing what the following pieces of logic accomplishes
         */

        if(array1.length != array2.length){
            System.out.println("Both arrays have different lengths, hence not a permutation");
           return false;
        }


        int count = 0;
        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array2.length; j++) {
                if(array1[i] == array2[j]) {
                    array2[j] = Integer.MIN_VALUE;
                    count++;
                    break;
                }
            }
        }
        if(count == array1.length){
            System.out.println("is permutation : true ");
            return true;
        }
        System.out.println("is permutation : false ");
        return false;
    }

    /*
    we're using the logic that, if two arrays are permutation of each other, then, sum.array1 = sum.array2 & prod.array1 = prod.array2
     */
    public boolean permutation(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i=0; i< array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 += array1[i];
            mul2 += array2[i];
        }

        if(sum1 == sum2 && mul1 == mul2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //pair 1; non-unique arrays with all values matching
        int[] intArray1 = {1, 1, 0};
        int[] intArray2 = {1, 0, 1};

        //pair 2; at least 2 values match
        int[] intArray3 = {1, 1, 0};
        int[] intArray4 = {1, 0, 0};

        //pair 3; unique array with no values matching
        int[] intArray5 = {1, 2, 3};
        int[] intArray6 = {4, 5, 6};

        // pair 4; unique array with all values matching
        int[] intArray7 = {1, 2, 3, 4};
        int[] intArray8 = {3, 1, 4, 2};
        isPermutation(intArray3, intArray4);
    }
}