package methods;

public class StringMethods {
    static boolean compareStrings(String str1,String str2){
        if(str1.equals(str2)){
            return true;

        }
            return false;

    }

    static String strStr(String stra, String strb){
        return (stra+strb).toUpperCase();
    }
    static int qqweqwe(String s1, String s2){
        return (s1+s2).length();
    }


    public static void main(String[] args) {
        boolean isSame = compareStrings("hello","helloooool");//false
        System.out.println(isSame);

        String strqwe=strStr("abcd","qwer");
        System.out.println(strqwe);
    }
}
