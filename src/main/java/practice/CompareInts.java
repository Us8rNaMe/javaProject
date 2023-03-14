package practice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numebrs");
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a>b&&a>c){
            System.out.println("A the bigger");
        } else if (b>a&&b>c) {
            System.out.println("B the bigger");

        } else if (c>a&&c>b) {

            System.out.println("C the bigger");

        }else {
            System.out.println("Wrong number");
        }

    }
}
