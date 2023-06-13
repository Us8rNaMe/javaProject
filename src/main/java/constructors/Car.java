package constructors;

public class Car {
    /*
    Task 1: Create a class called "Car" that represents a car with a make, model, and year. The class should have:
A default constructor that sets the make and model to "Unknown" and the year to 0.
A constructor that takes in three parameters, the make, model, and year, and sets them accordingly.
A constructor that takes in two parameters, the make and model, and sets them accordingly, and sets the year to 0.
A method called "printInfo" that prints out the make, model, and year of the car.
     */
    String make,model;
    int year;


    public Car(){
        make = "Unknown";
        year = 0;
    }

    public Car(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public Car(String make,String model){
        this.model = model;
        this.make = make;
        year = 0;
    }

    public void printInfo(){
        System.out.println("The cars make: "+make);
        System.out.println("The cars model: "+model);
        System.out.println("The cars year: "+ year);
    }
}
