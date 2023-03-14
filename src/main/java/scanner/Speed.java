package scanner;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("what is speed: ");
        int speed = user.nextInt();

        System.out.println("is today your birthday");
        boolean Day = user.nextBoolean();

        if(Day) {
            if (speed >= 60 && speed <= 80) {
                System.out.println("No ticket");

            } else {if (speed > 100) {
                    System.out.println("medium ticket");
                }
            }if (speed >= 60 && speed <= 80) {
                System.out.println("Small ticket");

            } else {
                if (speed < 60) {
                    System.out.println("No ticket");

                } else {
                    if (speed >= 80 && speed <= 100) {
                        System.out.println("medium ticket");

                    }else{
                            System.out.println("large ticket");
                    }
                    }
                }
            }
        }
}

