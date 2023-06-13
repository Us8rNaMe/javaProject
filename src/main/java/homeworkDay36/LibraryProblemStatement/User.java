package homeworkDay36.LibraryProblemStatement;

import java.util.ArrayList;

public class User {
    private String name;

    private int id;

    private int maxBooks;

    private ArrayList<Book> borrowedBooks;


    public User(String name, int id, int maxBooks) {

        this.name = name;

        this.id = id;

        this.maxBooks = maxBooks;

        borrowedBooks = new ArrayList<>();


    }

    public ArrayList<Book> getBorrowedBooks() {

        return borrowedBooks;

    }


    public void addBorrowedBooks(Book book) {

        borrowedBooks.add(book);


    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public int getId() {

        return id;

    }


    public void setId(int id) {

        this.id = id;

    }


    public int getMaxBooks() {

        return maxBooks;

    }
}

