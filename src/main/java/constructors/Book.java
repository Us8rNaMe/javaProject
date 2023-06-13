package constructors;
public class Book {
    String title;
    String author;
    String ISBN;
    double price;


    public Book(String titleOfTheBook,String authorOfTheBook, String ISBNOfTheBook,double priceOfTheBook){
        title = titleOfTheBook;
        author = authorOfTheBook;
        ISBN = ISBNOfTheBook;
        price = priceOfTheBook;
    }

    public Book (String titleOfTheBook, String authorOfTheBook,String ISBNOfTheBook){
        title = titleOfTheBook;
        author = authorOfTheBook;
        ISBN = ISBNOfTheBook;
        price = 0.0;
    }

    public Book (String titleOfTheBook, String authorOfTheBook) {
        title = titleOfTheBook;
        author = authorOfTheBook;
        ISBN = "Unknown";
        price = 0.0;
    }

    //public  String displayBookInfo (){
      //  String info = "Title of the book "+ title ;//+ "\n"+
                //"Author of the book " "+ accountNumber+ "\n;
               // "Balance: "+ balance+ "\n"+
               // "Interest rate: "+ interestRate+ "\n"+
                //"OverDraft limit: "+ overdraftLimit
       // return 0;
   // }



    public static void main(String[] args) {
        Book book1 = new Book(" ","   ","      ",0.0);
        book1.author = "Rowling";
        book1.title = "Harry Potter";
        book1.ISBN = "1423474301";
        book1.price = 0;


        System.out.println(book1.ISBN);
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);


        Book book2 = new Book("1984","Orwell","16890964",45.99);
        System.out.println(book2.ISBN);


        Book book3 = new Book("123","123123","1231312313",89.99);
        book3.author = "Rowling";
        book3.title = "Harry Potter";
        book3.ISBN = "123314411";




    }
}
