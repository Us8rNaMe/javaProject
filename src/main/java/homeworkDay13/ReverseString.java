package homeworkDay13;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");
        String word1 = scanner.nextLine();
        String reversed = "";
        for(int i = word1.length()-1; i>=0; i--){
            reversed += word1.charAt(i);
        }
        System.out.println(reversed);
    }
}
