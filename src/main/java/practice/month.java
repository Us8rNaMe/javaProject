package practice;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        if(a == 1||a==3||a==5||a==7||a==8||a==10||a==12){
            System.out.println("31 days");
        } else if (a==2) {
            System.out.println("28 days");

        }else if(a==4||a==6||a==9||a==11){
            System.out.println("30 days");

        }else{
            System.out.println("invalid month");
        }
    }
}
