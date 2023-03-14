package objects2;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "leo";
        student1.phone = "121231232";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Carolina";
        student2.phone = "16786758232";
        student2.email = "carolina@gmail.com";
        student2.age = 17;
        student2.major = "Doctor";


        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();

    }
}
