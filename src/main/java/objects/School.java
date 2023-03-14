package objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Lee";
        student1.phone = "1234512324";
        student1.email = "Lee123@gmail.com";
        student1.age = 10;
        student1.major = "Sniper";

        Student student2 = new Student();
        student2.name = "Potato";
        student2.phone = "321321231";
        student2.email = "Potato@gmail.com";
        student2.age = 11;
        student2.major = "PresidentOfBelarys";


        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();
    }
}
