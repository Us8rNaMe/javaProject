package homeworkDay22;

import java.util.Arrays;

public class PracticeArraysHW {

       public static int[] num = {2,312,3,342,43,64,2,41,245,6,37,58,6,453,32,1,123,435,99263,84};

       public static String [] sortedString = {"qwer","asd","zxc","PotatoTheBest"};


       public static boolean contains54And90(int[] pt) {
           boolean pt54 = false;
           boolean pt90 = false;
           for (int number : pt) {
               if (number == 54) {
                   pt54 = true;
               } else if (number == 90) {
                   pt90 = true;
               }

               if (pt54 && pt90) {
                   return true;
               }
           }return false;
       }






       public static double average(int[] num1) {

        Arrays.sort(num1);
        int sum = 0;
        for (int i = 1; i < num1.length - 1; i++) {
            sum += num1[i];
        }
        return (double)sum / (num1.length - 2);
    }






    public static void main(String[] args) {
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        Arrays.sort(sortedString);
        System.out.println(Arrays.toString(sortedString));

        int [] pt={12,123,312331,54,90,2,3};
        System.out.println(contains54And90(pt));

        int [] num1={1,2,3,41,2,3,4,5,6,7,8};
        System.out.println(average(num1));

        }
    }


