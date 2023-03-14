package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int a=10;
        while(a<=10){
            System.out.println(a);
            a++;


        }

        //================================

        a=100;
        while (a>=99){

            if(a%2!=0){
                System.out.println(a);

            }a--;

        }
        a=31;
        while (a<=31){

            System.out.println(a+" January 2023");
            a++;

        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scanner.nextInt();
        boolean isPrime = true;

        int num1 = 2;
        while (num1 < number) {
            if (number % num1 == 0) {
                isPrime = false;
                break;
            }
            num1++;
        }
        if (isPrime) {
            System.out.println("number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }



    }
}
