package com.deloitte.lab4ex3.library;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(String id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "CD: " + super.toString() + ", Artist=" + artist + ", Genre=" + genre;
    }
}
