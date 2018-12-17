package model;

import java.util.Date;

public abstract class MediaItem {
    private int length;
    private String name;
    private java.util.Date dateRelease;
    private String author;
    private boolean isRent = false;
    private boolean isReturn = false;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract boolean isFind(String metaData);

    public abstract boolean isPreview();

    public abstract void returnMediaItem();

    public abstract void rentMediaItem();

    public abstract void reservedMediaItem();

}
