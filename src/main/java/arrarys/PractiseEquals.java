package arrarys;

import java.util.Arrays;
import java.util.Scanner;

public class PractiseEquals {
    public static void main(String[] args) {
        int [] aray1 ={1,2,3};
        int [] aray2 ={1,2,3,4};
        int [] aray3 ={1,2,3};

        System.out.println(Arrays.equals(aray1,aray2));
        System.out.println(Arrays.equals(aray1,aray3));


        String [] colors = new String[20];
        Arrays.fill(colors,"red");

        System.out.println(Arrays.toString(colors));

        boolean [] b1 = {true, true, false};
        boolean [] b2 = Arrays.copyOf(b1, 3);

        System.out.println(Arrays.toString(b1));

        System.out.println(Arrays.toString(b2));
    }
}
