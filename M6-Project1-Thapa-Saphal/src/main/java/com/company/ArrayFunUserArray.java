package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-20: ");
        String user = myScanner.nextLine();


        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        for (int element: array ) {
            System.out.println(element);
        }

    }

}
