package com.company;
import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println("The original array is : ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println("The reversed array is: ");
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]+" ");

        }
    }

}
