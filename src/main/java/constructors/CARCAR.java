package constructors;

public class CARCAR {
    public static void main(String[] args) {
    CARCAR carcar1 = new CARCAR();
    CARCAR carcar2 = new CARCAR("camry","toyota ",2021);
    CARCAR carcar3 = new CARCAR("R8","Audi");

    carcar1.printInfo();
    carcar2.printInfo();
    carcar3.printInfo();
    }

    String make,model;
    int year;


    public CARCAR(){
        model = make = "Unknown";
        year = 0;
    }
    public CARCAR(String model,String make,int year){
        this.model = model;
        this.year = year;
        this.make = make;
    }
    public CARCAR(String model, String make){
        this.make = make;
        this.model = model;
        this.year = 0;
    }
    public void printInfo(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }
}