package strings;

public class StringEquals {
    public static void main(String[] args) {
        String country1 = "USA";
        String country2 = "USA";
        String country3 = new String("USA");

        System.out.println(country1 == country2);
        System.out.println(country1 == country3);
        System.out.println(country3 == country2);
        System.out.println(country1.equals(country2));
        System.out.println(country2.equals(country3));
        System.out.println(country1.equals(country3));

    }
}
