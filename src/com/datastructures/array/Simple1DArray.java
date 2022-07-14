package com.datastructures.array;

import java.util.Arrays;

public class Simple1DArray {

    // declare array
    int[] intNumber =  null;

    // create constructor to instantiate array
    public Simple1DArray(int sizeOfArray) {
        intNumber = new int[sizeOfArray];

        // set default array value to min Integers instead of 0
        for(int i=0; i<intNumber.length; i++) {
            intNumber[i] = Integer.MIN_VALUE;
        }
    }

    // create a method to insert(initialize) values into array, with O(1) time complexity
    public void insert(int location, int valueToBeInserted) {
        try {
            // check if location has default min Integer values, so that we don't overwrite an already initialized block
            if(intNumber[location] == Integer.MIN_VALUE) {
                intNumber[location] = valueToBeInserted;
                System.out.println("Successfully inserted!");
            } else {
                System.out.println("Location is already initialized(occupied)!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location, index doesn't exists : " + e);
        }
    }

    // Search an element in Array, with O(n) time complexity
    public void searchArrayElement(int valueToBeSearched) {
        try {
            System.out.println("Searching for array element .../...");
            for(int i=0; i<intNumber.length; i++) {
                if(intNumber[i] == valueToBeSearched) {
                    System.out.println("Array element is found at : " + i);
                    return;
                }
            }
            System.out.println("Array element not found");
        } catch (Exception e) {
            System.out.println("Array is not instantiated : " + e);
        }
    }

    public static void main(String[] args) {
        Simple1DArray simple1DArray = new Simple1DArray(10);

        simple1DArray.insert(0,0);
        simple1DArray.insert(2,10);
        simple1DArray.insert(9,10);
        simple1DArray.insert(0,0);
        simple1DArray.insert(20,400);

        // log array. P.S. we had to access intNumber with class object(instance) simple1DArray, as intNumber field is non-static
        System.out.println(Arrays.toString(simple1DArray.intNumber));

        // Array search
        simple1DArray.searchArrayElement(10);
    }
}
