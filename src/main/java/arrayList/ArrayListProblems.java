package arrayList;

import java.util.ArrayList;

public class ArrayListProblems {
    public static int returnSumOfEvens(ArrayList<Integer>numbers){

        int sum = 0;
        for(int i = 0;i<numbers.size();i++){
        if(numbers.get(i) % 2 != 0){
            sum+=numbers.get(i);
        }
        }return sum;
    }
    public static ArrayList<String> reverseStrings(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            list.set(i, reverseStr(list.get(i)));
        }
        return list;
    }

    public static String reverseStr(String str){
        String empty = "";
        for (int i = str.length()-1; i >= 0; i--){
            empty+=str.charAt(i);
        }
        return empty;
    }
}

