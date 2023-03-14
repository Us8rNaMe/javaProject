package strings;

public class PractiseSubstring {
    public static void main(String[] args) {
        String first_name = "Jacob";
        String last_name = "Coffee";

        System.out.println(first_name.substring(0,1)+last_name.substring(4,6));
        System.out.println(last_name.substring(0,1)+last_name.substring(4,6));
        System.out.println(first_name.substring(0,3)+last_name.substring(4,6));
        System.out.println(last_name.substring(0,2)+first_name.substring(4));
        System.out.println(last_name.toUpperCase().charAt(2) + last_name.substring(4)+first_name.substring(2,4));
        System.out.println(last_name.toUpperCase().charAt(1) +""+ last_name);

    }
}
