package arrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("cabbage");
        vegetables.add("pepper");
        vegetables.add("onion");
        vegetables.add("lettuce");


        String [] arrayOfVegetables = new String[vegetables.size()];
        vegetables.toArray(arrayOfVegetables);
        System.out.println(Arrays.toString(arrayOfVegetables));



        Integer [] arrayOfInts = {1,2,3,4,5,6};
        List<Integer> arrayListOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayListOfInts.size());
        System.out.println(arrayListOfInts);



    }
}
