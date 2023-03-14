package problemSolving;

import java.util.Scanner;

public class PotatoNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String word = scanner.nextLine();

            for (int i = 0; i < word.length(); i++) {
                int counter = 0;
                for (int b = 0; b < word.length(); b++) {
                    if (word.charAt(i) == word.charAt(b)) {
                        counter++;
                    }
                }
                System.out.println(word.charAt(i) + " " + counter++);
            }
        }
    }
