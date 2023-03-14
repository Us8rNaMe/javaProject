package methodOverloading;

public class ArithmeticOperations {
    //=================================================================

    public int Arithmetic(int a, int b) {
        return a + b;
    }

    public int arithmetic(int a, int b, int c) {
        return a + b + c;
    }

    public int average(int a, int c, int b, int e) {
        return (a + b + c + e) / 4;
    }

    public int average(int a, int c, int b, int e, int u, int y) {
        return (a + b + c + e + u + y) / 6;
    }

    //=================================================================

    public double getAreaOfTriangle(double base,double heigth){
        return 0.5*base*heigth;

    }

    public int getAreaOfTriangle(int a,int b,int c){
        int s=(a+b+c)/2;
        return(int) Math.sqrt((s*(s-a)*(s-b)*(s-c)));

    }
}
