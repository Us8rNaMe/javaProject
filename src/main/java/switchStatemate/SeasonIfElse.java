package switchStatemate;

import java.util.Scanner;

public class SeasonIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12: ");
        int month = scanner.nextInt();
        if (month == 1) {
            System.out.println("winter");

        } else if (month == 2) {
            System.out.println("winter");


        } else if (month == 3) {
            System.out.println("spring");

        } else if (month == 4) {
            System.out.println("spring");


        } else if (month == 5) {
            System.out.println("spring");

        } else if (month == 6) {
            System.out.println("summer");

        } else if (month == 7) {
            System.out.println("summer");


        } else if (month == 8) {
            System.out.println("summer");

        } else if (month == 9) {
            System.out.println("4");


        } else if (month == 10) {
            System.out.println("4");

        } else if (month == 11) {
            System.out.println("4");
        }else if (month == 12) {
            System.out.println("winter");

        }else {
            System.out.println("wrong number");
        }
}}



