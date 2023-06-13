package arrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList  <>();
        fruits.add("watermelon");
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("carrot");

        System.out.println(fruits);

        fruits.set(1,"potato");
        System.out.println(fruits);

        fruits.remove(1);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

        fruits.add("potato");
        System.out.println(fruits);

        boolean hasPotato = fruits.contains("potato");
        if (fruits.contains("potato")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
