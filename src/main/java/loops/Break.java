package loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int s =scanner.nextInt();
        int limit=40;
        for(int i=0; i<=s;i++){
            if(i>40){
                break;// stop and jump out of loop
            }
            System.out.println(i);
        }
        System.out.println("After loop");




    }
}
