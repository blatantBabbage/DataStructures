package com.datastructures.array.interviewquestions.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BestScore {

    public static int[] findTopTwoScores(int[] array){
        int topScore = Integer.MIN_VALUE;
        int secondTopScore = Integer.MIN_VALUE;
        for(int i=0; i< array.length; i++) {
            if (array[i] > topScore) {
                secondTopScore = topScore;
                topScore = array[i];
            } else if (array[i] > secondTopScore && array[i] < topScore) {
                secondTopScore =array[i];
            }
        }
        int[] bestScore = {topScore, secondTopScore};
        System.out.println(Arrays.toString(bestScore));
        return bestScore;
    }

    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        findTopTwoScores(myArray);
    }
}
