package homeworkDay27;

import java.util.Arrays;

public class ForEachHW {
    int [] intArray = {4,6,2,7,99,4,322,4,66,7,9,99,5,3,33,8,9};

        public static void array(int [] intArray){
            for(int num : intArray){
                System.out.println("arrat is"+num);
            }
        }
        public static int sumArray(int [] intArray) {
            int sum = 0;
            for (int num: intArray){
                sum+=num;
            }
            System.out.println("The sum is "+sum);
            return sum;
        }
        public static void evenArray(int [] intArray){
            for(int num : intArray){
                if(num%2==0){

                    System.out.println("The even num is "+num);
                }
            }
        }
        public static int largestArray(int [] intArray){
            int max = Integer.MIN_VALUE;
            for(int num : intArray){
                if(num> max){
                    max=num;
                }
            }
            System.out.println("The largest num is "+ max);
            return max;
        }
        public static int smallestArray(int [] intArray){
            int min = Integer.MAX_VALUE;
            for (int num : intArray){
                if(num<min){
                    min=num;
                }
            }
            System.out.println("The smallest num is "+min);
            return min;
        }
        public static int elementArray(int [] intArray,int element){
            int count =0;
            for(int num : intArray){
                if(num == element){
                    count++;
                }
            }
            System.out.println("Element "+ element+ " count " + count);
            return count;
            }
        public static boolean specificArray(int [] intArray,int elementS){
            for(int num : intArray){
                if(num == elementS){
                    System.out.println("True");
                    return true;
                }
            }
            System.out.println("False");
            return false;
        }
        public static void copyPasteArray(int [] intArray,int [] potato){
            int i =0;
            for( int  num : intArray) {
                potato[i++] = num;
            }
        }
        public static void reverseArray(int [] intArray){
            int[] temp = new int[intArray.length];
            int i = 0;

            for (int num : intArray) {
                temp[intArray.length - 1 - i++] = num;
            }

            for (i = 0; i < intArray.length; i++) {
                intArray[i] = temp[i];
            }
        }


    public static void main(String[] args) {
        int [] intArray = {4,6,2,7,99,4,322,4,66,7,9,99,5,3,33,8,9};
        int [] potato = new int[17];
        int element = 4;
        int elementS = 322;
            array(intArray);
            elementArray(intArray,element);
            smallestArray(intArray);
            largestArray(intArray);
            evenArray(intArray);
            sumArray(intArray);
            specificArray(intArray,elementS);
            copyPasteArray(intArray,potato);
            System.out.println(Arrays.toString(potato));
            reverseArray(intArray);
            System.out.println(Arrays.toString(intArray));


    }
}


