package practiceOOP;

public class Bird extends Animal{


    private double wingSpawn;

    public Bird() {

    }

    public double getWingSpawn() {
        return wingSpawn;
    }

    public void setWingSpawn(double wingSpawn) {
        this.wingSpawn = wingSpawn;
    }

    @Override
    public void makeSound() {

    }
    public Bird(String name, int age, double weight,double wingSpawn) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setWingSpawn(wingSpawn);
    }
}
