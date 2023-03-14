package strings;

import java.util.Locale;

public class StringToLowerCase {
    public static void main(String[] args) {

        String word = " Hello EverYONE! HOW ARE you doinG";
        word = word.toLowerCase();

        System.out.println(word);

        String word2 = "hello guys I'm good AND you?";
        System.out.println(word2);

        word2 = word2.toUpperCase();
        System.out.println(word2);


        System.out.println(word.equalsIgnoreCase(word2));

        String word3 = "hello everyone";
        String word4 = "HELLO EVERYONE";

        System.out.println(word3.toUpperCase().equalsIgnoreCase(word4));
        System.out.println(word4.toLowerCase().equalsIgnoreCase(word3));

    }
}
