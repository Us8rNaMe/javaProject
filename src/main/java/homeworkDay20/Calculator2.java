package homeworkDay20;

public class Calculator2 {

    public static int  add(int x,int y){
        return x+y;
    }
    public static int substract (int x, int y){
        return x-y;
    }
    public static int multiply (int x, int y){
        return x*y;
    }
    public static double divide (int x,int y){
        if(y==0){
            int result =0;
            System.out.println("num cannot be divided by 0");
            return result;
        }return x/y;
    }
    public static int modulus (int x, int y){
        return x%y;
    }
    public static int factorial (int x) {
        int result = 1;
        int a = 1;
        while (a <= x) {
            result *= a;
            a++;
        }
        return result;
    }
    public static double squareRootOf (int x) {
        double result = Math.sqrt(x);
        return result;
    }


    }
