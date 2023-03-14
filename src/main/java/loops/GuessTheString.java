package loops;
import java.util.Scanner;

public class GuessTheString {
    public static void main(String[] args) {
        String word;
        do {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter word");
            word = scanner.nextLine();
            System.out.println(word.length());
            if(word.length()>10){
                System.out.println("Enter again it more than 10");
            }else if (word.length()<10){

                System.out.println("this is less than 10");
            }else{
                System.out.println("nice");
            }


        }while (word.length()!=10);
    }
}
