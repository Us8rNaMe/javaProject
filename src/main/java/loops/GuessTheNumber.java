package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(1,100);

        int usersNumber;
        Scanner user = new Scanner(System.in);
        do {
            System.out.println("enter number");
            usersNumber = user.nextInt();

            if(randomNumber>usersNumber){
                System.out.println("is lower");

            } else if (randomNumber<usersNumber) {
                System.out.println("is higher");

            } else if (randomNumber==usersNumber) {
                System.out.println("correct");

            }else{
                System.out.println("Wrong number");
            }
        }while(randomNumber!=usersNumber);
    }
}
