package polymorhpism;

public class Horse extends Animal {

    public void print_description() {
        System.out.println("Horses are beautiful "+"and can run long distance ");
    }

    public void display_pictures() {
        System.out.println("Here is horse");
    }

    public void display_food_info() {
        System.out.println("Horses eat veggie only");
    }

    public void make_sound() {
        System.out.println("Eeeho");
    }
    public void play_animal_music(){
    System.out.println("Playing cheerful music for horses");
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        Dog dog = new Dog();

        Animal aniHorse = new Horse();
        Animal aniDog = new Dog();

        horse.play_animal_music();
        aniHorse.display_food_info();
        aniDog.display_pictures();
    }
}
