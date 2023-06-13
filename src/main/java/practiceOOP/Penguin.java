package practiceOOP;

public class Penguin extends Bird{



    public Penguin(String name, int age, double weight, double wingSpawn) {
        super(name, age, weight, wingSpawn);
    }

    public Penguin() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is singing");
    }
}
