package inheritance.transportation;

public class Transport {


    public Transport(){
        System.out.println("This is Transport default constructor");
    }
    public Transport(String type){
        System.out.println("this is transport constructor: "+ type);
    }


    static {
        System.out.println("this is static block of transport class");
    }


    {
        System.out.println("instance block of transport class");
    }




    int num_of_wheels;
    boolean hasSteeringWheel;
    int num_of_seats;


    public void start(){

    }

    public void accelerate(int speed){

    }

    public void stop(){

    }
}
