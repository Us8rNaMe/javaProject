package objects;

public class Car {
    String price;
    String color;
    String model;
    String year;


    public void classprice(){
        System.out.println(price+" is price a car");

    }
    public void claascolor(){
        System.out.println(color+" is color this car");

    }
    public void printInfo(){
        System.out.println("car model is "+model+ " and model year is "+year);
        System.out.println("Car price is "+ price+" and color is "+color);
    }
}
