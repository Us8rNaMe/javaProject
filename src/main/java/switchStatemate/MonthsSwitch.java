package switchStatemate;

import java.util.Scanner;

public class MonthsSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 6");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
    }
}
