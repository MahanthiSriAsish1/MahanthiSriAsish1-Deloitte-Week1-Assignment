package com.deloitte.lab4ex3;

import com.deloitte.lab4ex3.library.Book;
import com.deloitte.lab4ex3.library.CD;
import com.deloitte.lab4ex3.library.JournalPaper;
import com.deloitte.lab4ex3.library.Video;

public class Lab4Ex3 {
	public static void main(String[] args) {
		Book book = new Book("B001", "Java Programming", 5, "Ravi Sharma");
		JournalPaper journal = new JournalPaper("J001", "AI Research", 3, "Anita Desai", 2022);
		Video video = new Video("V001", "Gully Boy", 2, 148, "Zoya Akhtar", "Drama", 2019);
		CD cd = new CD("C001", "A. R. Rahman Hits", 10, 42, "A. R. Rahman", "Music");

        System.out.println(book);
        System.out.println(journal);
        System.out.println(video);
        System.out.println(cd);

        book.checkOut();
        System.out.println("After checking out a book: " + book);
        book.checkIn();
        System.out.println("After checking in the book: " + book);
    }

}
