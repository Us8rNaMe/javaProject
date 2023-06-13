import java.util.Arrays;

public class Homework {

    public static int [] reverseArray(int [] array){
        int [] newArray = new int[array.length];
        int index = array.length-1;
        for(int element : array){
            newArray[index] = element;
            index--;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
        int [] array ={23,34,23,23,3,3,23,23,2,1,3,4,5,};
        System.out.println(array);
    }
}
