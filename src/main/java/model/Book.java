package model;

public abstract class Book extends MediaItem implements Readable {
    @Override
    public boolean isFind(String metaData) {
        return false;
    }

    @Override
    public boolean isPreview() {
        return false;
    }

    @Override
    public void returnMediaItem() {
    }

    @Override
    public void rentMediaItem() {
    }

    @Override
    public void reservedMediaItem() {
    }

    public abstract void canBeRead();
}
