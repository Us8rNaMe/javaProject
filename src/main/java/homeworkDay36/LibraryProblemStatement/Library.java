package homeworkDay36.LibraryProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> catalog;
    List<User> users;

    public Library() {
        catalog = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void borrowBook(User user, Book book) {

        if (user.getMaxBooks() >= user.getBorrowedBooks().size()) {

            System.out.println("Unfortunately, you cannot borrow book, because you already exhaust your limit");

        } else {

            user.addBorrowedBooks(book);

            catalog.remove(book);

            System.out.println("Successfully, you borrowed the book: " + book.getTitle());

        }


    }
}
