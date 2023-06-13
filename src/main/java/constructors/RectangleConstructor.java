package constructors;

public class RectangleConstructor {
    int length;
    int width;


    public RectangleConstructor(){
        width=1;
        length=1;
    }
    public RectangleConstructor(int length, int width){
        this.length=length;
        this.width=width;
    }
    public RectangleConstructor(int potato){
        width = potato;
        length = potato;
    }
    public int area(){
        return length*width;

    }

    public static void main(String[] args) {
        RectangleConstructor rectangleConstructor = new RectangleConstructor();
        RectangleConstructor rectangleConstructor1 = new RectangleConstructor(5,10);
        RectangleConstructor rectangleConstructor2 = new RectangleConstructor(10);

        System.out.println(rectangleConstructor.area());
        System.out.println(rectangleConstructor1.area());
        System.out.println(rectangleConstructor2.area());
    }

}
