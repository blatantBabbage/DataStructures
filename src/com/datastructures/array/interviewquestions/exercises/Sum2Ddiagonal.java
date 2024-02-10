package com.datastructures.array.interviewquestions.exercises;

public class Sum2Ddiagonal {

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if(i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("The summ  of diagonal elements is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        sumDiagonalElements(myArray2D);
    }
}
