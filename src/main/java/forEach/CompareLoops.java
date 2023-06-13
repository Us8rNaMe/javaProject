package forEach;

public class CompareLoops {
    public static void main(String[] args) {
        /*
        int [] array = {6,3,2,4,6,7,8,9,0};

//FOR LOOP
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

//FOR EACH LOOP
        for (int element : array){
            System.out.println(element);
        }

//WHILE LOOP
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }

//DO WHILE LOOP
        int a = 0;
        do{
            System.out.println(array[a]);
            a++;
        }while(a < array.length);

*/
        int [] arrayOfInts ={234,234,234,23,324,343,4,534,34};
        double sum = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            sum += arrayOfInts[i];
        }
        double average = sum / arrayOfInts.length;
        System.out.println(average);




        double sum2 =0;
        for (int avaragee : arrayOfInts){
            sum2 += avaragee;
        }

        double average2 = sum2 / arrayOfInts.length;
        System.out.println(average2);





        double sum3 = 0;
        int w = 0;
        while (w < arrayOfInts.length) {
            sum3 += arrayOfInts[w];
            w++;
        }
        double average3 = sum3 / arrayOfInts.length;
        System.out.println(average3);







        double sum4 = 0;
        int s = 0;
        do {
            sum4 += arrayOfInts[s];
            s++;
        } while (s < arrayOfInts.length);
        double average4 = sum4 / arrayOfInts.length;
        System.out.println(average4);
    }
}
