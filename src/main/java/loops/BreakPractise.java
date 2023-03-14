package loops;

import java.util.Scanner;

public class BreakPractise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        for(int c=0;c<=(a+b);c++){
            System.out.println(c);
            if(c==45){
                break;
            }
        }

    }
}
