package strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String ad ="Buy two, get one for free!";
        int index = ad.indexOf('g');
        System.out.println(index);


        int index1 = ad.indexOf('t');
        System.out.println(index1);
        System.out.println(ad.indexOf('t'));


        System.out.println(ad.indexOf(('o'+ad.indexOf('o')+1)));
    }
}
