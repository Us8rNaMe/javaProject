package objects;

public class Animal {

    String type;
    boolean isMamal;
    boolean isCarnivare;
    int age;
    String habitat;


    public void eat(){
        System.out.println("animal type si "+type+ " and animal age is "+age+" years old");

    }
    public void sleep(){
        System.out.println("this is a habitat this animal "+habitat);

    }
    public void play() {
        System.out.println("this is " + isMamal);
        System.out.println("this is " + isCarnivare);

        //eat()
        //sleep()
        //play()

    }
}
