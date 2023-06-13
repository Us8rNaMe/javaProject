package homeworkDay17;

public class MobilePhone {
    String model;
    String price;
    String memory;

    public void phoneModel() {System.out.println("model this phone is "+model);}
    public void phonePrice() {System.out.println("price this "+model+"is "+price);}
    public void phoneMemory() {System.out.println(model+" have "+memory);}

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        phone1.model="LG";
        phone1.memory = "12000 mb";
        phone1.price = "500$";

        MobilePhone phone2 = new MobilePhone();
        phone2.model = "Iphone";
        phone2.memory = "6000 mb";
        phone2.price = "1000$";

        phone1.phoneMemory();
        phone1.phoneModel();
        phone1.phonePrice();

        System.out.println();

        phone2.phoneMemory();
        phone2.phoneModel();
        phone2.phonePrice();

    }




}
