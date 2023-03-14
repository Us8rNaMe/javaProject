package homeworkDay15;

import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }i++;
        }System.out.println("The sum of odd integers up to " + n + " is " + sum);
    }
}
