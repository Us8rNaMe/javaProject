package switchStatemate;

import java.util.Scanner;

public class UsersGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from A to F");
        String gr = scanner.nextLine();
        if (gr.equals("A")) {
            System.out.println("u are the best");

        } else if (gr.equals("B")) {
            System.out.println("good job");


        } else if (gr.equals("C")) {
            System.out.println("nice");

        } else if (gr.equals("D")) {
            System.out.println("good");


        } else if (gr.equals("E")) {
            System.out.println("u need more practise");

        } else if (gr.equals("F")) {
            System.out.println("u so bad");

        } else {
            System.out.println("Invalid grade");
        }





    }
}
