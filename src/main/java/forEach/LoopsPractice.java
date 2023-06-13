package forEach;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println(getAverageOfEvenNums());
    }
    public static double getAverageOfEvenNums(){
        double sum = 0;
        int count = 1;
        int i = 0;
        while (count <= 10){
            if(i%2==0){
                count++;
                sum+=i;
            }
            i++;
        }return sum/count;





    }
}
