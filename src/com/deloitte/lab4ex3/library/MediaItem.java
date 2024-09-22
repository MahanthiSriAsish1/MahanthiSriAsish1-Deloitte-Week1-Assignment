package com.deloitte.lab4ex3.library;

public abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(String id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime=" + runtime + " minutes";
    }
}
