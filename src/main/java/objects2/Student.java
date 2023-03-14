package objects2;

public class Student {
    String name;
    int age;
    String major;
    String email;
    String phone;

    public  void read(){
        System.out.println(name + " is reading");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public  void  attendClass(){
        System.out.println(name +" is attending "+major);
    }

    public void printInfo(){
        System.out.println("Student's name is "+name+". And student is "+ age+ " years old");
        System.out.println("Stydent studies at "+major);
        System.out.println("Student's contact details ( email: "+email+" ,phone: "+phone);

    }
}
