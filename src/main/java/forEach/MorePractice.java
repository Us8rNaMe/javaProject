package forEach;

import java.util.Arrays;

public class MorePractice {
    public static String [] rearrangeArray(String[] array) {

        String[] newArray = new String[array.length];
        int index =0;
        for(int i = 0;i<array.length;i++){
            if(i % 2 == 0){
                newArray[index]=array[i];
            index++;

            }
        }
        for(int i = 0;i<array.length;i++) {
            if (i % 2 != 0) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
  }
}
