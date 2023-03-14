package strings;

import java.util.Locale;

public class PractiseStrings {
    public static void main(String[] args) {

         String singerName = "Michael Jakson";
         System.out.println(singerName.length());//14

         System.out.println(singerName.endsWith("on"));//TRUE
         System.out.println(singerName.startsWith("Misha"));//False because  misha ane Michael

        System.out.println(singerName.isEmpty());//true

        System.out.println(singerName.toLowerCase());//michael jakson
        System.out.println(singerName);//Michael Jakson

        System.out.println(singerName.toUpperCase());//MICHAEL JAKSON

        singerName = singerName.toUpperCase();
        System.out.println(singerName);

        System.out.println(singerName.charAt(0));//M

        System.out.println(singerName.charAt(0)+singerName.charAt(3));//Mh
        System.out.println(singerName.charAt(8));

        System.out.println(singerName.indexOf("c"));//2
        System.out.println(singerName.indexOf('C', 3));
        System.out.println(singerName.indexOf("W"));//-1

        //System.out.println(singerName.charAt(2352));//Index out of bounds error

        String singerName2 = "Justin Biber";

        boolean areTheySame = singerName2.equals(singerName);//false
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2));//true

        singerName = singerName2;

        System.out.println(singerName.equals(singerName2));//true
        System.out.println(singerName == singerName2);//true




    }
}
