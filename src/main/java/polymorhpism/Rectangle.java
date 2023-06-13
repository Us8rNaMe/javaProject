package polymorhpism;

public class Rectangle extends Shape {

    public void print_Info(){
        System.out.println("This is a rectangle");
    }

    public void print_Info(String type){
        System.out.println("This is a "+type);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape shape = new Shape();
        Shape rectangleShape = new Rectangle();

        rectangle.print_Info();
        shape.print_Info();
        rectangleShape.print_Info();

        rectangle.print_Info("square");
    }




}
