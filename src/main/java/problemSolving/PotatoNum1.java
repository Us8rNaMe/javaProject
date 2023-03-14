package problemSolving;

import java.util.Scanner;

public class PotatoNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.nextLine();
        String sp = "";
        String nsp = " ";

        for(int i =0;i<nsp.length();i++) {
            if (str.charAt(i) == nsp.charAt(i)) {
                System.out.println("is empty");
            } else if (str.isEmpty()) {
                System.out.println("is empty");
            } else {
                System.out.println("is potato not empty");
            }
        }
    }
}
