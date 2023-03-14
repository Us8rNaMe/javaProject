package problemSolving;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = scanner.nextLine();

        int length = word.length();
        boolean isPalindome = true;

        for(int i=0; i<length/2;i++){
            if(word.charAt(i)!= word.charAt(length-1-i)){
                isPalindome = false;

            }
        }
        System.out.println(isPalindome);

    }
}
