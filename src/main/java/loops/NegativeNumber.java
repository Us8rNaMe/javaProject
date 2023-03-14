package loops;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;


        do{
            System.out.println("Enter even number");
            number = scanner.nextInt();

            if(number%2!=0){
                System.out.println("wrong number enter even number");
            }else{
                System.out.println("even number");
            }

        }while(number%2==2);
    }
}
