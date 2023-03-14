package practice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two word");
        String a, b;
        a = scanner.nextLine();
        b = scanner.nextLine();

        if(a.equals(b)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}

