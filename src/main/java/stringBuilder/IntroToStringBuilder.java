package stringBuilder;

public class IntroToStringBuilder {
    public static void main(String[] args) {
        String name = "Jessica";
        name = "Jessy";
        System.out.println(name);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("John");
        StringBuilder sb3 = new StringBuilder(20);


        System.out.println(sb2);

        sb2.append(" Galt");
        System.out.println(sb2);

        sb2.append(20);
        System.out.println(sb2);

        sb2.append(true);
        System.out.println(sb2);


        sb2.insert(0,"Hello ");
        System.out.println(sb2);

        sb2.insert(5," ");
        System.out.println(sb2);


        sb2.replace(0,18,"potato ");
        System.out.println(sb2);

        sb2.replace(sb2.length()-4,sb2.length(),"the best");
        System.out.println(sb2);


        sb2.delete(5,6);
        System.out.println(sb2);


        sb2.reverse();
        System.out.println(sb2);







    }
}
