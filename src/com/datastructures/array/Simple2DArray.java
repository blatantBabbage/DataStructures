package com.datastructures.array;

import java.util.Arrays;

public class Simple2DArray {

    // declare array
    int[][] intNumbers = null;

    // create constructor to instantiate array
    public Simple2DArray(int rows, int columns) {
        intNumbers = new int[rows][columns];

        // set default array value to min Integers instead of 0, as set by compiler for int Arrays
        // Note: Incase of 2D arrays,array.length() method returns number of rows
        for(int i=0; i<intNumbers.length; i++) {
            for (int j=0; j<intNumbers[0].length; j++) {
                intNumbers[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // create a method to insert(initialize) values into array, with O(1) time complexity
    public void insert(int row, int column, int valueToBeInserted) {
        try{
            if(intNumbers[row][column] == Integer.MIN_VALUE) {
                intNumbers[row][column] = valueToBeInserted;
                System.out.println("Successfully inserted!");
            } else {
                System.out.println("Location is already initialized(occupied)!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location, index doesn't exists : " + e);
        }
    }

    // Search an element in Array by Array traversal, with O(mn) time complexity
    public void searchArrayElement(int valueToBeSearched) {
        try {
            System.out.println("Searching for array element .../...");
            for(int i=0; i<intNumbers.length; i++) {
                for(int j=0; j<intNumbers[0].length; j++) {
                    if(intNumbers[i][j] == valueToBeSearched) {
                        System.out.println("Array element is found at row : " + i + " column : " + j);
                        return;
                    }
                }
            }
            System.out.println("Array element not found");
        } catch (Exception e) {
            System.out.println("Array is not instantiated : " + e);
        }
    }

    public static void main(String[] args) {
        Simple2DArray simple2DArray = new Simple2DArray(3,3);
        simple2DArray.insert(0,0, 20);
        simple2DArray.insert(2,1, 32);
        simple2DArray.insert(0,0, 100);
        simple2DArray.insert(1,2, 9);
        simple2DArray.insert(3,10, 1000);

        // log array. P.S. we had to access intNumber with class object(instance) simple1DArray, as intNumber field is non-static
        System.out.println(Arrays.deepToString(simple2DArray.intNumbers));

        // Array search
        simple2DArray.searchArrayElement(32);
    }
}
