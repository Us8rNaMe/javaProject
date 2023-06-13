package abstraction;

public abstract class Mobile_Phone extends Device {

    public void regularMethod(){
        System.out.println("Hi, I'm a regular method");
    }

    String model;
    int memory;
    String color;

    public abstract void call();
    public abstract void text();
    public abstract void ring();
}
