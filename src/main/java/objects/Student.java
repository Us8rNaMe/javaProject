package objects;

public class Student {

    String name;
    int age;
    String major;
    String email;
    String phone;

    public void read(){
        System.out.println(name+" is reading");


    }
    public void attendClass(){
        System.out.println(name+" is a attending "+major);
    }
    public void printInfo(){
        System.out.println("Students name is "+name+ " and student is "+age+" years old");
        System.out.println("Student studies at "+ major);
        System.out.println("Students contact deteils (email: "+email+", phone: "+phone+")");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");


    }

}


