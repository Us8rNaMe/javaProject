package homeworkDay36.LibraryProblemStatement;

public class MAin {
    public static void main(String[] args) {
        Book book1 = new Book( "Adventures of Tom Sawyer","Mark Twain" );
        Book book2 = new Book("Alice in Wonderland","Lewis Carrol");
        Book book3 = new Book( "Agni Veena","Kazi Nasrul Islam" );
        Book book4 = new Book("Arms and the Man","G.B.Shaw");
        Book book5 = new Book( "Ancient Mariner","Coleridge" );
        Book book6 = new Book("Animal Farm","George Orwell");
        Book book7 = new Book( "Around the World in eighty days","Jules Verne" );
        Book book8 = new Book("Robinson Crusoe","Daniel Defoe");
        Book book9 = new Book( "Pilgrim's Progress","John Bunyan" );
        Book book10 = new Book("Don Quixote","Miguel De Cervantes");

        Student student = new Student("Sam",123);
        Faculty faculty = new Faculty("Samanta",124);

        Library library = new Library();

        library.addUser(student);
        library.addUser(faculty);

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook(student,book2);

        library.borrowBook(student,book3);
        library.borrowBook(student,book4);
        library.borrowBook(student,book5);
        library.borrowBook(student,book6);
        library.borrowBook(student,book7);

        library.borrowBook(faculty,book9);
        library.borrowBook(faculty,book10);
        library.borrowBook(faculty,book8);

    }


}

