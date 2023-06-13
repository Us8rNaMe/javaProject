package set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Practise_Set {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("word");
        list.add("potato");
        list.add("vegetable");
        list.add("table");
        list.add("table");
        list.add("lamp");
        list.add("chair");
        list.add("kebab");

        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);

        for(Integer i : set1){
            for (Integer k : set2){
                if(i==k){
                    set3.remove(i);
                    }
                }
            }
        System.out.println(set3);
    }
    public static String potato (String str) {
        return str.substring(1, str.length() - 1);
    }
}
