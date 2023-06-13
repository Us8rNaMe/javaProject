package stringBuilder;

public class ConvertToString {
    public static void main(String[] args) {

        String city = "Madrid";
        StringBuilder name = new StringBuilder(city);

        StringBuilder sb = new StringBuilder("hello");
        String hi = sb.toString();

        System.out.println(hi);

        System.out.println(palindrome(new StringBuilder("potato")));
        System.out.println(revers("Potato"));
    }


    public static String revers(String word) {

        StringBuilder sb1 = new StringBuilder(word);
        sb1.reverse();
        String rev = sb1.toString();
        return rev;
    }

    public static String reverse(String word1) {
        String a = "";
        for (int i = word1.length() - 1; i >= 0; i--) {
            a += word1.charAt(i);
        }
        return a;
    }

    public static StringBuilder whiteSpaces(String word3){
        return new StringBuilder(word3.replace(" ",""));
    }

    public static boolean palindrome(StringBuilder word4){
        String str = word4.toString();
        return str.equals(word4.reverse().toString());
        }
    }

