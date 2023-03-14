package practice;

import java.util.Scanner;

public class Charakters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1,str2;

        System.out.println("Enter first word");
        str1 = scanner.nextLine();

        System.out.println("Enter second word");
        str2 = scanner.nextLine();

        if(str1.length()>str2.length()){
            System.out.println(str1);
        }
        else if (str1.length() < str2.length()){
            System.out.println(str2);
        }
        else {
            System.out.println("Equal");
        }


    }
}
