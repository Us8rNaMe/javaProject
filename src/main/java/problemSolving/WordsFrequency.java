package problemSolving;

import java.util.ArrayList;

public class WordsFrequency {
    public static void printWordsFrequency(ArrayList<String>list){

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apple");
        words.add("banana");
        words.add("banana");
        words.add("banana");
        words.add("kiwi");
        words.add("kiwi");
        words.add("kiwi");
        words.add("kiwi");
        for(int i = 0;  i < list.size(); i++){
            int count = 0;
            for(int j = 0; j < list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    count ++;
                }
            }
            System.out.println(list.get(i) + " appears " + count);
        }


    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apple");
        words.add("banana");
        words.add("banana");
        words.add("banana");
        words.add("kiwi");
        words.add("kiwi");
        words.add("kiwi");
        words.add("kiwi");
        System.out.println();
    }

    public static void lettersFrequency(String word){


    }
}
