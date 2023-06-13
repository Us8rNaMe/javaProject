package abstraction;

public class Samsung extends Mobile_Phone {


    public void call() {
        System.out.println("Samsung is calling");
    }

    public void text() {
        System.out.println(("Samsung is texting"));
    }

    public void ring() {
        System.out.println("Samsung is ringing");
    }


    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.call();
        samsung.text();
        samsung.ring();
    }

    public void turn_on(){
    }

    public void turn_off() {
    }

    @Override
    public void turn_On() {

    }

    @Override
    public void turn_of() {

    }
}