package com.company;

import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] agrs) {
        Scanner myScanner = new Scanner(System.in);
        // Get input from the user

        System.out.println(("Please enter a number between 1 and 12 inclusive: "));
        String userInput = myScanner.nextLine();

        //convert the user input into a number

        int userDay = Integer.parseInt(userInput);


        // compare userDay to the numbers betwn 1 and 7 and print out the correct day

        // note : the week starts on monday

        if (userDay == 1){
            System.out.println("January");
        }else if (userDay == 2){
            System.out.println("February");
        }else if (userDay == 3){
            System.out.println("March");
        }else if (userDay == 4){
            System.out.println("April");
        }else if (userDay == 5) {
            System.out.println("May");
        }else if (userDay == 6) {
            System.out.println("June");
        }else if (userDay == 7) {
            System.out.println("July");
        }else if (userDay == 8){
            System.out.println("August");
        }else if (userDay == 9){
            System.out.println("September");
        }else if (userDay == 10){
            System.out.println("October");
        }else if (userDay == 11) {
            System.out.println("November");
        }else if (userDay == 12) {
            System.out.println("December");
        } else {
            System.out.println("You entered an incorrect number!!!");
        }
    }
}
