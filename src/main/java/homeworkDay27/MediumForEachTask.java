package homeworkDay27;

import java.util.Arrays;

public class MediumForEachTask {

    public static void range(int [] arrayInt){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int num : arrayInt){
            if(num<min){
                min = num;
            }if(num>max){
                max = num;
            }
        }int range1 = max - min;


        System.out.println("Range: "+range1);
    }

    public static void mean(double [] arrayInt1){
        double sum = 0;
        for(double average : arrayInt1){
            sum += average;
        }
        double average2 = sum/arrayInt1.length;
        System.out.println("Mean: "+average2);
    }

    public static void median(int [] arrayInt){
        Arrays.sort(arrayInt);
        int middle = (arrayInt.length-1) /2;
        int potato = arrayInt[middle];
        System.out.println("Median: "+potato);
    }


















    public static void main(String[] args) {
        int [] arrayInt = {7,5,6,2,3,1,4};
        double [] arrayInt1 = {7,5,6,2,3,1,4};
        range(arrayInt);
        mean(arrayInt1);
        median(arrayInt);

    }

}
