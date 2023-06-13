package practiceOOP;

public class Test_Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setName("Simba");
        lion.setAge(1);
        lion.setWeight(200);

        Penguin penguin = new Penguin();
        penguin.setName("Kovalski");
        penguin.setAge(3);
        penguin.setWeight(50);
        penguin.setWingSpawn(1);

        Salmon salmon = new Salmon();
        salmon.setName("Alaska");
        salmon.setAge(1);
        salmon.setWaterType("saltWater");
        salmon.setWeight(2);


        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(penguin);
        zoo.addAnimal(salmon);

        zoo.listAnimal();

        System.out.println("================");
        zoo.removeAnimal(lion);

        zoo.listAnimal();
        zoo.addAnimal(new Lion("Alex",2,150,"brown"));

        Animal penguin2 = new Penguin("Shkipper",2,60,90);
        Animal penguin3 = new Bird("Isa",1,45,1);
        Bird penguin5 = new Penguin("Pilot",3,50,2);
        Bird penguin6 = new Penguin();
        Penguin penguin4 = new Penguin("Rico",2,43,2);



    }
}
