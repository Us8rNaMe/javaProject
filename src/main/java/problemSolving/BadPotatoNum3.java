package problemSolving;

import java.util.Scanner;

public class BadPotatoNum3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string");
        String str2 = scanner.nextLine();

        //AppleBanana 1
        //APPLE banana banana APPLE 1
        //PPLE BNN (remove all a's and print all in uppercase)
        //ApBa
        //LeNa
        //AB

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+str2);
        System.out.println(str1.toUpperCase()+str2+str2+str1.toUpperCase());
        String str3 = str1.toUpperCase();
        String str4 = str2.toUpperCase();
        System.out.println(str3.replace("A","")+" "+str4.replace("A",""));







    }
}
