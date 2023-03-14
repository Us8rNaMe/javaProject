package methodOverloading;

public class IsPrime {

    public boolean printNumber(int number){
        boolean isPrime = true;
        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                return false;
            }
        }
            return true;
    }
    public boolean printNumber(short number){
        boolean isPrime = true;
        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean printNumber(long number){
        boolean isPrime = true;
        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
