package homeworkDay7;

public class StringManipulationHW {
    public static void main(String[] args) {
        //==============================================
        String str1 = "Hello, Universe!";
        char ch = 'o';
        boolean c = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch) {
                c = true;
                break;
            }
        }if (c){
            System.out.println(true);
        }
        //==========================================
        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println(str2.substring(start,end));
        //============================================
        String str3 = "Good morning World";
        char q = 'W';
        int i = str3.indexOf(q);
        System.out.println(str3.charAt(i));
        //=========================================
        String str4 = "         I love coding     ";
        System.out.println(str4.trim());
        //===========================================
        String str5 = " Learn as if you will live forever, live like you will die tomorrow.";
        System.out.println(str5.replaceAll("a",""));


    }
}
