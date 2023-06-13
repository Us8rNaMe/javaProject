package practiceOOP;

public class Lion extends Mammal{

    public Lion(String name, int age, double weight, String FurColor) {
        super(name, age, weight, FurColor);
    }

    public Lion() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is Roaring");
    }
}
