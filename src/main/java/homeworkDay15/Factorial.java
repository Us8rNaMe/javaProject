package homeworkDay15;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        int n = input.nextInt();
        int factorial = 1;

        while (n > 1) {
            factorial *= n;
            n--;
        }System.out.println(factorial);
    }
}
