package objects;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.color = "White";
        car1.year = "2015";
        car1.price = "7500$";

        Car car2 = new Car();
        car2.model = "Hyundai";
        car2.color = "Red";
        car2.year = "2017";
        car2.price = "12000$";



        car1.printInfo();
        car2.printInfo();

        car1.classprice();
        car2.classprice();

        car1.claascolor();
        car2.claascolor();


    }
}
