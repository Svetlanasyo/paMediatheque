package model;

public class AudioBook extends MediaItem implements Listernable {
    @Override
    public boolean isFind(String metaData) {
        if (getName().contains(metaData)) {
            return true;
        }
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

    public void canBeListened() {

    }
}
