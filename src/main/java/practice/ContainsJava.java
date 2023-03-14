package practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();

        if(word.toLowerCase().contains("java")){
            System.out.println("True");

        }else{
            System.out.println("false");
        }


    }
}
