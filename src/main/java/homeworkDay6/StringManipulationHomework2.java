package homeworkDay6;

public class StringManipulationHomework2 {
    public static void main(String[] args) {
        /*1*/String str1 = "Hello world";
        System.out.println(str1.indexOf(str1.substring(6)));

        /*2*/System.out.println(str1.charAt(0));

        /*3*/String str3 = "HELLO";
        System.out.println(str3.toLowerCase());

        /*4*/String str4 = "hello";
        System.out.println(str4.toUpperCase());

        /*5*/System.out.println(str4.equals(str3));

        /*6*/String q = "the quick brown fox";
        System.out.println(q.substring(0,1).toUpperCase()
                +q.substring(1,3).toLowerCase()
                +" "+q.substring(4,5).toUpperCase()+q.substring(5,9).toLowerCase()
                +" "+q.substring(10,11).toUpperCase()+q.substring(11,15).toLowerCase()
                +" "+q.substring(16,17).toUpperCase()+q.substring(17,19).toLowerCase());

        /*7*/String w = "Hello";
        for (int i = w.length() - 1; i >= 0; i--) {
            System.out.print(w.charAt(i));

        }System.out.println("");

        /*8*/String str = "Hello World";
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);

        /*9*/String a="Hello";
        String s="World";
        System.out.println(a.concat(s));

        /*10*/String qw = "hello";
        String wq = "HELLO";
        System.out.println(qw.equalsIgnoreCase(wq));

        /*11*/System.out.println(str.length());

        /*12*/System.out.println(a.charAt(3));

        /*13*/System.out.println(str.indexOf('l'));

        /*14*/System.out.println(qw.equals(str4));
        System.out.println(qw==str4);

        /*15*/System.out.println(qw.equals(wq));
        System.out.println(qw==wq);

        /*16*/String as = "HELLO WORLD";
        System.out.println(as.toLowerCase());

        /*17*/String sd = "hello world";
        System.out.println(sd.toUpperCase());

        /*18*/System.out.println(str.replace("l","r"));

        /*19*/System.out.println(q.substring(0,1).toUpperCase()
                +q.substring(1,3).toLowerCase()
                +" "+q.substring(4,5).toUpperCase()+q.substring(5,9).toLowerCase()
                +" "+q.substring(10,11).toUpperCase()+q.substring(11,15).toLowerCase()
                +" "+q.substring(16,17).toUpperCase()+q.substring(17,19).toLowerCase());

    }
}
