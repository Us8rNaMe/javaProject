package homeworkDay14;

import java.util.Scanner;

public class PracticeBreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        while (a <= 0) {
            System.out.print("Enter a positive integer: ");
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Error: You must enter a positive integer.");
            }
        }
        boolean hasIntegers = false;
        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
                hasIntegers = true;
            }
        }
        if (!hasIntegers) {
            System.out.println("There are no integers that meet the criteria.");
        }

    }
}
