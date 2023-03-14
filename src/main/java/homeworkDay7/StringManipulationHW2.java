package homeworkDay7;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        String str5 = "Learn as if you will live forever, live like you will die tomorrow.";
        System.out.println(str5.endsWith("."));

        System.out.println(str5.substring(0,1));

        System.out.println(str5.replaceAll("l","1"));

        int start = 10;
        int end = 20;
        System.out.println(str5.substring(start,end));

        System.out.println(str5.length()-1);

        System.out.println(str5.startsWith("L"));

        System.out.println(str5.replace("L","weqrwerqfrqw"));

        System.out.println(str5.replace(" ",""));

        System.out.println(str5.toUpperCase());






    }
}
