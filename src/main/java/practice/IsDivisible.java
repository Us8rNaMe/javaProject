package practice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = 10;
        int num2 = 5;

        if (num1 % num2==0){
            System.out.println("It is divisble");
        }
        else {
            System.out.println(" It is not divisible");
        }

    }

}
