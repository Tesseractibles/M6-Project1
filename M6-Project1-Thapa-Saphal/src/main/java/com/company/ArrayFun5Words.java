package com.company;
import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner myScanner = new Scanner(System.in);

        for (int i =0; i<arr.length; i++ ) {
            System.out.println("Please enter five words!");
            arr[i] = myScanner.nextLine();
        }
        for (String element: arr ) {
            System.out.println(element);
        }
    }
}