package practiceOOP;

public class Fish extends Animal{

    public Fish(){

    }

    public Fish(String name, int age, double weight,String waterType){
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setWaterType(waterType);
    }



    private String waterType;

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }


    @Override
    public void makeSound() {

    }
}
