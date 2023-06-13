package abstraction.product;
public abstract class Product {

    String title;
    String description;
    Double price;
    String seller;
    int reviews;
    double average_of_reviews;


    public abstract void review();
    public abstract void add_to_cart();





}
