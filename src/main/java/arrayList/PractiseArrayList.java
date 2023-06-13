package arrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PractiseArrayList {
    public static void main(String[] args) {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("cabbage");
        vegetables.add("pepper");
        vegetables.add("onion");
        vegetables.add("lettuce");
        System.out.println(vegetables);

        vegetables.remove(2);
        vegetables.remove(3);

        vegetables.add("carrot");
        vegetables.add("tomato");
        vegetables.add("cucumber");

        System.out.println(vegetables.size());
        vegetables.clear();


        String[] strings = new String[5];
        strings[0] = "apple";
        strings[1] = "banana";
        strings[2] = "cherry";
        strings[3] = "date";
        strings[4] = "elderberry";

        System.out.println(Arrays.toString(strings));
        System.out.println("Array size: " + strings.length);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(arrayList);



        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(1);
        qwe.add(2);
        qwe.add(3);
        qwe.add(4);
        qwe.add(5);
        System.out.println(qwe);

        qwe.remove(2);
        qwe.remove(3);

        qwe.add(123);
        qwe.add(23);
        qwe.add(13);

        System.out.println(qwe.size());
        qwe.clear();

        int[] integers = new int[5];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;

        System.out.println(Arrays.toString(integers));
        System.out.println("Array size: " + integers.length);

        //ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(integers));
        System.out.println(arrayList);
    }
}
