package strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String banner = "thanksGiving sale 20%";

        boolean issale = banner.startsWith("thanks");
        System.out.println(issale);

        System.out.println(banner.startsWith("thanks"));
        System.out.println(banner.startsWith("T"));
        System.out.println(banner.startsWith("Giving"));

        boolean endSwith = banner.endsWith("%");
        System.out.println(endSwith);

        System.out.println(banner.endsWith("Sale 20%"));
        System.out.println(banner.endsWith("sale 20%"));

    }

}
