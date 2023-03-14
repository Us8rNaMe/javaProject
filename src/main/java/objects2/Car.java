package objects2;

public class Car {
    String model;
    int year;
    String price;
    String color;

    public void drive(){
        System.out.println(model+" its the best car in driving");
    }
    public void year(){
        System.out.println("this car made in "+year);
    }
    public void price(){
        System.out.println("This "+model+" cost "+price);
    }
    public void color(){
        System.out.println("Color this "+model+" is "+color);
    }
}
