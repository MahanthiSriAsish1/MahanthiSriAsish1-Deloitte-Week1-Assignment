package com.deloitte.lab4ex3.library;

public class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(String id, String title, int copies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Video: " + super.toString() + ", Director=" + director + ", Genre=" + genre + ", Year Released=" + yearReleased;
    }
}
