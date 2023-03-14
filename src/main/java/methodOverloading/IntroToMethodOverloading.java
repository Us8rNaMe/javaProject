package methodOverloading;

public class IntroToMethodOverloading {

    public int getArefOfRectangle(int length, int width) {
        return length * width;
    }

    public int getaAreaOfRectangle(long length, int width) {
        return (int) (length + width);
    }

    public int getaAreaOfRectangle(double length, double width) {
        System.out.println(9.4+"fbg".substring(6,8));
        return (int) (length + width);
    }
    //===================================================================

    public int getPerimeterOfSquare(int length){
        return (length*4);
    }

    public  int getPerimeterOfSquare(double length) {
        return (int) (length * 4);
    }

    public int getPerimeterOfSquare(long length) {
        return (int) (length * 4);
    }

    //====================================================================
}
