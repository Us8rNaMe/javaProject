package forEach;

import java.util.ArrayList;

public class IntroToForEach {
    public static void main(String[] args) {
        String [] array = {"potato","onion","carrot","pepper"};

        for(String veggie : array ){
            System.out.println(veggie);
        }
    int [] intArray = {1,2,3,4,5,6,7,8};
        for(int num: intArray){
            System.out.println(num);
        }
        System.out.println();





        byte [] byteArray = {5,3,7,5,1};
            for (int i = 0; i < byteArray.length;i++){
                System.out.println(byteArray[i]);
            }

        for (byte byteArray2 : byteArray){
            System.out.println(byteArray2);
        }


        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(33.5);
        doubleList.add(1.13);
        doubleList.add(67.1);
        doubleList.add(1.6);
        doubleList.add(5.5);

        for (int a = 0; a < doubleList.size();a++){
            System.out.println(doubleList.get(a));
        }
        for (Double doubleList2 : doubleList){
            System.out.println(doubleList2);
        }
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        stringArrayList.add("Bye");
        stringArrayList.add("Welcome");
        stringArrayList.add("City");
        stringArrayList.add("State");

        for (int b = 0; b < stringArrayList.size();b++){
            System.out.println(stringArrayList.get(b));
        }
        for (String stringArrayList2 : stringArrayList ){
            System.out.println(stringArrayList2);
        }

        boolean [] booleanArray = {true,false,true,true,false};
        for (int k = 0; k < booleanArray.length;k++){
            System.out.println(booleanArray[k]);
        }
        for (boolean booleanArray2 : booleanArray){
            System.out.println(booleanArray2);
        }





    }
}
