package polymorhpism;

public class Auto_Mobile implements Vehicle,Machine{
    public void drive() {
        System.out.println("auto is driving");
    }

    public void signal() {
        System.out.println("auto is signaling");
    }


    public boolean need_service() {
        return false;
    }


    public boolean Is_broken() {
        return false;
    }


    public void work() {

    }


    public void help_people() {

    }

    public static void main(String[] args) {
        Auto_Mobile autoMobile = new Auto_Mobile();
        Vehicle vehicle = new Auto_Mobile();
        Machine machine = new Auto_Mobile();

    }
}
