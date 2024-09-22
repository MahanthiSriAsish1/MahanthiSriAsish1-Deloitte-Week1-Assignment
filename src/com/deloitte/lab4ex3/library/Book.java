package com.deloitte.lab4ex3.library;

public class Book extends WrittenItem {
    public Book(String id, String title, int copies, String author) {
        super(id, title, copies, author);
    }

    @Override
    public String toString() {
        return "Book: " + super.toString();
    }
}
