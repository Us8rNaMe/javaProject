package expections;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number:");
            int a = scanner.nextInt();

            System.out.println("Enter second number:");
            int b = scanner.nextInt();

            System.out.println("Enter arithmetic operator:");
            String operator = scanner.next();

            switch (operator){
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                default:
                    System.out.println("");
                    throw new ArithmeticException("Invalid arithmetic operator.Accepted operators: + - / *");
            }

        }
    }