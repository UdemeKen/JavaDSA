package org.example.calculateAverageTemperature;

import java.util.Scanner;

public class Calculate {
    public static void averageTemperature() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many day's temperature? ");
        int numDays = console.nextInt();
        int[] temp = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temperature: ");
            temp[i] = console.nextInt();
            sum += temp[i];
        }
        double average = sum / numDays;
        int above = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " day(s) above average");
    }
}
