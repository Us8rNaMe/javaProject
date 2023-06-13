package practiceOOP;

public  class Mammal extends Animal {

    private String furColor;

    public Mammal() {

    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public Mammal(String name, int age, double weight,String FurColor){
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setFurColor(FurColor);
    }


    @Override
    public void makeSound() {

    }
}
