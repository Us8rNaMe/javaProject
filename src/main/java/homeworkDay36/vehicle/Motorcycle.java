package homeworkDay36.vehicle;

public class Motorcycle extends Vehicle {
    int numWheels;
    public void rev(){
        System.out.println("Revving the engine");
    }
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("==============================");
        car.start();
        car.drive();
        car.model="A4";
        car.make="Audi";
        car.numDoors = 4;
        car.year = 2023;
        System.out.println("Model this "+car.make+" is "+car.model+" and this car also have "+ car.numDoors+" doors and made in "+car.year);


        Motorcycle motorcycle = new Motorcycle();
        System.out.println("==============================");
        motorcycle.rev();
        motorcycle.drive();
        motorcycle.numWheels =2;
        motorcycle.make="Jupiter";
        motorcycle.model = "IZH";
        motorcycle.year = 1971;
        System.out.println("Model this "+motorcycle.make+" is "+motorcycle.model+" and this motorcycle also have "+ motorcycle.numWheels+" wheels and made in "+motorcycle.year);
        System.out.println("==============================");
    }
}

