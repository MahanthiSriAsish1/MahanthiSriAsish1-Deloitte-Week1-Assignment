package com.deloitte.lab4ex3.library;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "JournalPaper: " + super.toString() + ", Year Published=" + yearPublished;
    }
}
