package homeworkDay17;

public class Rectangle {
    int width;
    int heigth;

         public void calculateArea(){System.out.println(width*heigth);}
         public void calculatedPerimetr(){System.out.println((width+heigth)*2);}


    public static void main(String[] args) {
        Rectangle Area1 = new Rectangle();
        Area1.width=12;
        Area1.heigth = 17;

        Rectangle Area2 = new Rectangle();
        Area2.width = 2;
        Area2.heigth = 7;

        Area1.calculateArea();
        Area1.calculatedPerimetr();

        Area2.calculateArea();
        Area2.calculatedPerimetr();


    }
}
