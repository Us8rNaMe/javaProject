package arrarys;

public class SameAsLast {
    /*
    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
     */
    public static boolean sameFirstLast(int[] arr) {
        return arr.length >= 1 && arr[0] == arr[arr.length - 1];

    }

    public static boolean str(String[] arrr) {
        if (arrr.length >= 3 && arrr[0].equals(arrr[1]) && arrr[arrr.length - 1].equals(arrr[1])){
            return true;
    }else return false;
}























    public static void main(String[] args) {


        int[] num1 = {1, 2, 3, 4, 5, 1};
        int[] num2 = {1, 2, 3, 4, 5};
        int[] num3 = {1, 2, 3, 4, 5};

        System.out.println(sameFirstLast(new int []{1,2,3,4,5,1}));
        System.out.println(sameFirstLast(num2));
        System.out.println(sameFirstLast(num3));



    }
}
