package com.datastructures.array.project;

import java.util.Scanner;

public class DaysAboveAvgTemp {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("How many days temperature do you want to analyse?");
        int numOfDays = consoleInput.nextInt();
        double sum = 0;
        double[] tempOfDays = new double[numOfDays];
        for(int i=0; i<numOfDays; i++) {
            System.out.println("Enter the temperature for the day " + (i+1) + " : ");
            tempOfDays[i] = consoleInput.nextDouble();
            sum += tempOfDays[i];
        }
        double averageTemp = sum/numOfDays;
        System.out.println("Average temp is : " + averageTemp);
        int numOfAboveAvgTempDays = 0;
        for (int i = 0; i<numOfDays; i++) {
            if(tempOfDays[i] > averageTemp) {
                numOfAboveAvgTempDays++;
            }
        }
        System.out.println("Number of days temperature is above : " + numOfAboveAvgTempDays);
    }
}
