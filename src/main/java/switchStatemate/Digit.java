package switchStatemate;

        import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the zip code ");
        int zipCode = scanner.nextInt();
        String zip = zipCode+ "";


        if (zip.length() == 5 && !zip.contains("9") && !zip.startsWith("0")){
            System.out.println("Zip Code is valid");
        }else{
            System.out.println("Zip Code is not valid");

        }
    }
}


