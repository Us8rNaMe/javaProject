package inheritance.transportation;

public class MotorizedTransport extends Transport {

public MotorizedTransport(){
    System.out.println("This is motorized default constructor");
}

public MotorizedTransport(String type){
    super("motorized");
    System.out.println("this is MotorizedTransport constructor: "+type);
}

static {
    System.out.println("this is MotorizedTransport first static block");
}

    static {
        System.out.println("this is MotorizedTransport second static block");
    }

    {
        System.out.println("This is MotorizedTransport first instance block");
    }

    {
        System.out.println("This is MotorizedTransport second instance block");
    }


    String engine_type;
    String type;
    int max_speed;


    public void drive(){
        System.out.println(engine_type);
        System.out.println(num_of_seats);
    }


    public void signal(){

    }


    public static void main(String[] args) {
        MotorizedTransport autoMobile = new MotorizedTransport("car");

    }
}
