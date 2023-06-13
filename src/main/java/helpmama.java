import java.util.Scanner;

public class helpmama {
    /*
        Task 2.
Problem: Write a program that asks the user to enter two numbers. Print the sum of the numbers.
Problem: Write a program that asks the user to enter their age - means your age. And prints your age doubled.
Problem: Write a program that asks the user to enter three numbers. Calculate and print the average of the three numbers.
Problem: Write a program that asks the user to enter their name. Print a message saying "Hello , name" followed by their name.
         */
    public static void main(String[] args) {


        Scanner scann = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scann.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scann.nextInt();
        System.out.println("Sum of numbers: " + (number1 + number2));

        System.out.print("Enter your age: ");
        int age = scann.nextInt();
        System.out.println("Doubled: " + (age * 2));

        System.out.print("Enter first number: ");
        double num1 = scann.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scann.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scann.nextDouble();
        System.out.println("Calculation of numbers: " + (num1 + num2 + num3));
        System.out.println("Average of numbers: " + (num1 + num2 + num3) / 3);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner1.nextLine();
        System.out.println("Hello, "+name);
    }
}

