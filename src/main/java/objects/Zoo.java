package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.type = "tiger";
        animal1.habitat= "Jungle";
        animal1.isMamal= true;
        animal1.isCarnivare= true;
        animal1.age=4;

        Animal animal2 = new Animal();
        animal2.type = "monkey";
        animal2.habitat= "jungle";
        animal2.isMamal= true;
        animal2.isCarnivare= false;
        animal2.age=2;

        Animal animal3 = new Animal();
        animal3.type = "camel";
        animal3.habitat= "desert";
        animal3.isMamal= true;
        animal3.isCarnivare= false;
        animal3.age=5;

        Animal animal4 = new Animal();
        animal4.type = "snake";
        animal4.habitat= "jungle";
        animal4.isMamal= false;
        animal4.isCarnivare= true;
        animal4.age=1;



        animal1.eat();
        animal1.sleep();
        animal1.play();

        animal2.eat();
        animal2.sleep();
        animal2.play();

        animal3.eat();
        animal3.sleep();
        animal3.play();

        animal4.eat();
        animal4.sleep();
        animal4.play();

















    }
}
