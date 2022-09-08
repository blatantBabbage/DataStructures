package com.datastructures.array.interviewquestions.exercises;

public class Rotate2DMatrix {
    // Method to transpose & reverse each row to rotate a matrix
    public void rotateMatrixNxN(int[][] arr2D) {
        // Transposing matrix
        for (int i=0; i<arr2D.length; i++) {
            // using j=i to make loop run in only upper half triangle of matrix
            for (int j=i; j<arr2D[0].length; j++) {
                int temp = arr2D[i][j];
                arr2D[i][j] = arr2D[j][i];
                arr2D[j][i] = temp;
            }
        }

        // Reversing row
        for (int i=0; i<arr2D.length; i++) {
                // the start and end index are dynamic
                int startIndex = 0;
                int endIndex = arr2D[i].length - 1;

                while (startIndex<endIndex) {
                    int temp = arr2D[i][startIndex];
                    arr2D[i][startIndex] = arr2D[i][endIndex];
                    arr2D[i][endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
        }

        // Display rotated matrix
        display(arr2D);
    }

    // Display 2D matrix
    public void display(int[][] Arr2D) {
        for (int i=0; i<Arr2D.length; i++) {
            for (int j=0; j<Arr2D[0].length; j++) {
                System.out.print(Arr2D[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rotate2DMatrix rotate2DMatrix = new Rotate2DMatrix();
        int[][] input2DArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotate2DMatrix.rotateMatrixNxN(input2DArr);
    }
}
