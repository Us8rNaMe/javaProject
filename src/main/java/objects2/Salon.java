package objects2;

public class Salon {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model="TOYOTA";
        car1.color="Green";
        car1.year = 2020;
        car1.price = "12500$";

        Car car2 = new Car();
        car2.model="Nissan";
        car2.color="Red";
        car2.year = 2010;
        car2.price = "7500$";

        car1.year();
        car1.price();
        car1.color();
        car1.drive();

        car2.year();
        car2.price();
        car2.color();
        car2.drive();
    }
}
