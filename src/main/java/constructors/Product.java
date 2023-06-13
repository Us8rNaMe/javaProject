package constructors;

public class Product {
    String name;
    double price;
    int quatity;
    String manufacturer;


    public Product() {
        name = "Unknown";
        price = 0.0;
        quatity = 0;
        manufacturer = "unknown";


    }
    public Product(String a,int b,double c,String r){
        this.name = a;
        this.quatity = b;
        this.price = c;
        this.manufacturer = r;
    }

    public String getDetails(){
       String info =  name+": "+price+"$ \n"+"Quantity: "+quatity+"\n"+"Manufacturer: "+manufacturer;
       return info;
    }

    public double getTotalPrice(){
        return price * quatity;
    }


    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("Orange juice", 250,4.99,"Sunny trees");

        System.out.println(product1.getDetails());
        System.out.println(product2.getDetails());

        System.out.println(product1.getTotalPrice());
        System.out.println(product2.getTotalPrice());


    }


}
