package homeworkDay15;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int digitCount;
        do {
            System.out.print("Enter a string: ");
            input = scanner.nextLine();
            digitCount = 0;
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    digitCount++;
                }
            }
            System.out.println("Number of digits in the string: " + digitCount);
        } while (digitCount != 3);

    }
}
