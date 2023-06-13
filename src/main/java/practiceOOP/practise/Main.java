package practiceOOP.practise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BookingWise!");
        boolean sessionExpired = false;
        while (!sessionExpired){
            System.out.println("Please choose one of below options:");
            System.out.println("1. sign in");
            System.out.println("2. sign up");
            System.out.println("3. exit");

            int answer = scanner.nextInt();
            User user = new User();

            switch (answer){
                case 1:
                    System.out.println("To sign in, please provide the username:");
                    String username = scanner.next();

                    System.out.println("Enter password: ");
                    String password = scanner.next();

                    user.login(username,password);
                    sessionExpired = true;
                    break;
                case 2:
                    System.out.println("To sign up, provide username: ");
                    username = scanner.next();

                    System.out.println("Enter password");
                    password = scanner.next();

                    System.out.println("Enter phone number (10 digits)");
                    String phoneNumber = scanner.next();

                    user.register(username,password, user.getEmail(), phoneNumber);
                    sessionExpired = true;
                    break;
                case 3:
                    System.out.println("Thanks for the visit, see you next time!");
                    sessionExpired = true;
                    break;
                default://
                    System.out.println("ERROR! Please enter 1 to sign in, 2 - sign up, 3 - exit");

            }
        }
    }
}
