package arrarys;

import java.util.Arrays;
import java.util.Comparator;

public class PractiseSort {
    public static void main(String[] args) {
        int [] numbers = {2,3,4,4,4,3,3,2,2,13,234,5,36,356,535,423,41,42,56,47,6743,};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
