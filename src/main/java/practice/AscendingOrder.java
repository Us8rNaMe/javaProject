package practice;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();
        //small
        if (a > b && a > c) {
            if (b > c){
                System.out.println("Ascending order: " + c + ", " + b + ", " + a);
                System.out.println("Descending order: " + a + ", " + b + ", " + c);
            }
            else {
                System.out.println("Ascending order: " + b + ", " + c + ", " + a);
                System.out.println("Descending order: " + a + ", " + c + ", " + b);
            }
        }
        // middle
        else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Ascending order: " + c + ", " + a + ", " + b);
                System.out.println("Descending order: " + b + ", " + a + ", " + c);            }
            else {
                System.out.println("Ascending order: " + a + ", " + c + ", " + b);
                System.out.println("Descending order: " + b + ", " + c + ", " + a);            }
        }
        // large
        else {
            if (b > a) {
                System.out.println("Ascending order: " + a + ", " + b + ", " + c);
                System.out.println("Descending order: " + c + ", " + b + ", " + a);            }
            else {
                System.out.println("Ascending order: " + b + ", " + a + ", " + c);
                System.out.println("Descending order: " + c + ", " + a + ", " + b);            }




        }

    }
}

