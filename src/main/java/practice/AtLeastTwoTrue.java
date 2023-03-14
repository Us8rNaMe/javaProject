package practice;

import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three booleans");

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        if(a && b && c){
            System.out.println("all true");
        } else if ((a && b) || ( b && c ) || ( c && a )){
            System.out.println("at least two are true");
        } else{
            System.out.println("at least 2 are not true");
        }
    }
}

