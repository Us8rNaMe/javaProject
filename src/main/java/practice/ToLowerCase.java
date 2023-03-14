package practice;

import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some word");
        String string = scanner.nextLine();

        System.out.println(string.toLowerCase());
    }
}



