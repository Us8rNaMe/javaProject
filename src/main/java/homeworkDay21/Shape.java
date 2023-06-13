package homeworkDay21;

public class Shape {
    public double areaOfACircle(int r) {
        double p = 3.14;
        return (r * r) * p;
    }

    public int areaOfACircle(int length, int width) {
        return length * width;
    }

    public double getAreaOfTriangle(double base, double heigth) {
        return 0.5 * base * heigth;
    }
}
