package practice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class VerifyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age;
        try {
            age = scanner.nextInt();
            if (age < 21) {
                throw new TooYoungException("Sorry, the driver must be at least 21");
            } else if (age > 50) {
                throw new TooOldException("Sorry, the age limit is 50");
            } else {
                System.out.println("Congratulations. You are accepted!");
            }
        } catch (TooYoungException e) {
            System.out.println("But you eligible to work in Uber Delivery!");
            System.out.println("Do you want to sign to Uber Delivery?");
            String answer = scanner.nextLine();
            if (answer.equals("Yes")) {
                System.out.println("Please provide your vehicle number");
                e.printStackTrace();
            }
        } catch (TooOldException e) {
            System.out.println("But you can apply to other job positions at Uber:");
            System.out.println("In order to apply, please fill out below form.");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("The user must enter digits as age from 0 to 150");
        }

    }
}